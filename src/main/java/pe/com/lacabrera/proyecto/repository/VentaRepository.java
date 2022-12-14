
package pe.com.lacabrera.proyecto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.lacabrera.proyecto.entity.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long >{
    @Query("select p from venta p where p.estado = '0'")
    List<Venta> findAllCustom();
}
