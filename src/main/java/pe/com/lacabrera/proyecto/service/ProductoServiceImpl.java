package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lacabrera.proyecto.entity.Producto;
import pe.com.lacabrera.proyecto.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    private ProductoRepository repository;

    @Override
    public List<Producto> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Producto> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public Optional<Producto> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public Producto add(Producto p) {
        return repository.save(p);
    }

    @Override
    public Producto update(Producto p) {
        Producto objproducto = repository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objproducto);
        return repository.save(objproducto);
    }

    @Override
    public Producto delete(Producto p) {
        Producto objproducto = repository.getById(p.getCodigo());
        objproducto.setEstado(false);
        return repository.save(objproducto);
    }
}
