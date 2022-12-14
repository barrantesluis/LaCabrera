
package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import pe.com.lacabrera.proyecto.entity.BoletaDeVenta;


public interface BoletaDeVentaPedidoService {
    public List<BoletaDeVenta> findAll();
    
    public List<BoletaDeVenta> findAllCustom();
    
    public Optional<BoletaDeVenta> findById(long id);
    
    public BoletaDeVenta add(BoletaDeVenta p);
    
    public BoletaDeVenta update(BoletaDeVenta p);
    
    
    public BoletaDeVenta delete(BoletaDeVenta p);
}
