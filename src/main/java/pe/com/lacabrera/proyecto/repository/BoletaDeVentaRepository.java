
package pe.com.lacabrera.proyecto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.lacabrera.proyecto.entity.BoletaDeVenta;

public interface BoletaDeVentaRepository extends JpaRepository<BoletaDeVenta, Long >{
    @Query("select p from cajero p where p.estado = '1'")
    List<BoletaDeVenta> findAllCustom();
}
