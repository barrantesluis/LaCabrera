/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.lacabrera.proyecto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.lacabrera.proyecto.entity.DetalleOrdenPedido;

/**
 *
 * @author one
 */
public interface DetalleOrdenPedidoRepository extends JpaRepository<DetalleOrdenPedido, Long >{
    @Query("select p from detalle_orden_pedido p where p.estado = '0'")
    List<DetalleOrdenPedido> findAllCustom();
    
}
