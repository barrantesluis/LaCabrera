package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import pe.com.lacabrera.proyecto.entity.Venta;


public interface VentaService {
    public List<Venta> findAll();
    
    public List<Venta> findAllCustom();
    
    public Optional<Venta> findById(long id);
    
    public Venta add(Venta p);
    
    public Venta update(Venta p);
    
    
    public Venta delete(Venta p);
}
