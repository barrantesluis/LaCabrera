
package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import pe.com.lacabrera.proyecto.entity.Cajero;

public interface CajeroService {
    public List<Cajero> findAll();
    
    public List<Cajero> findAllCustom();
    
    public Optional<Cajero> findById(long id);
    
    public Cajero add(Cajero p);
    
    public Cajero update(Cajero p);
    
    
    public Cajero delete(Cajero p);
}
