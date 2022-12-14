
package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lacabrera.proyecto.entity.Venta;
import pe.com.lacabrera.proyecto.repository.VentaRepository;

@Service
public class VentaServiceImpl implements VentaService {
    
    @Autowired
    private VentaRepository repository;

    @Override
    public List<Venta> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Venta> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public Optional<Venta> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public Venta add(Venta p) {
        return repository.save(p);
    }

    @Override
    public Venta update(Venta p) {
        Venta objVenta = repository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objVenta);
        return repository.save(objVenta);
    }

    @Override
    public Venta delete(Venta p) {
        Venta objVenta = repository.getById(p.getCodigo());
        objVenta.setEstado(false);
        return repository.save(objVenta);
    }
}
