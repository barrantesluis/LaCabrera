package pe.com.lacabrera.proyecto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.lacabrera.proyecto.entity.Cajero;

public interface CajeroRepository extends JpaRepository<Cajero, Long >{
    @Query("select p from cajero p where p.estado = '0'")
    List<Cajero> findAllCustom();
}
