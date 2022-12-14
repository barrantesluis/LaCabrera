/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.lacabrera.proyecto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.lacabrera.proyecto.entity.OrdenPedido;

/**
 *
 * @author one
 */
public interface OrdenPedidoRepository extends JpaRepository<OrdenPedido, Long >{
    @Query("select p from orden_pedido p where p.estado = '0'")
    List<OrdenPedido> findAllCustom();
    
}