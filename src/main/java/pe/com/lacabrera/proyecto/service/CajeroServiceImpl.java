
package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lacabrera.proyecto.entity.Cajero;
import pe.com.lacabrera.proyecto.repository.CajeroRepository;

@Service
public class CajeroServiceImpl implements CajeroService{
    
    
    @Autowired
    private CajeroRepository repository;

    @Override
    public List<Cajero> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Cajero> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public Optional<Cajero> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public Cajero add(Cajero p) {
        return repository.save(p);
    }

    @Override
    public Cajero update(Cajero p) {
        Cajero objCajero = repository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objCajero);
        return repository.save(objCajero);
    }

    @Override
    public Cajero delete(Cajero p) {
        Cajero objCajero = repository.getById(p.getCodigo());
        objCajero.setEstado(false);
        return repository.save(objCajero);
    }
}
