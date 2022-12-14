/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import pe.com.lacabrera.proyecto.entity.DetalleOrdenPedido;


public interface DetalleOrdenPedidoService {

    public List<DetalleOrdenPedido> findAll();

    public List<DetalleOrdenPedido> findAllCustom();

    public Optional<DetalleOrdenPedido> findById(Long id);

    public DetalleOrdenPedido add(DetalleOrdenPedido p);

    public DetalleOrdenPedido update(DetalleOrdenPedido p);

    public DetalleOrdenPedido delete(DetalleOrdenPedido build);
    
}
