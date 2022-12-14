
package pe.com.lacabrera.proyecto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.lacabrera.proyecto.entity.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    @Query("select c from Cliente c where c.estado=1")
    List<Cliente> findAllCustom();
}
