/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.lacabrera.proyecto.Controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.lacabrera.proyecto.entity.DetalleOrdenPedido;
import pe.com.lacabrera.proyecto.service.DetalleOrdenPedidoService;



/**
 *
 * @author one
 */
@RestController
@RequestMapping("/detalleordenpedido")
public class DetalleOrdenPedidoController {
    
    @Autowired
    private DetalleOrdenPedidoService service;
    
    @GetMapping
    public List<DetalleOrdenPedido> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<DetalleOrdenPedido> findAllCustom(){
        return service.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<DetalleOrdenPedido> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public DetalleOrdenPedido add(@RequestBody DetalleOrdenPedido p){
        return service.add(p);
    }
    @PutMapping("/{id}")
    public DetalleOrdenPedido update(@PathVariable long id,@RequestBody DetalleOrdenPedido p){
        p.setCodigo(id);
        return service.update(p);
    }
    @DeleteMapping("/{id}")
    public DetalleOrdenPedido delete(@PathVariable long id){
        DetalleOrdenPedido objDetalle = new DetalleOrdenPedido();
        objDetalle.setEstado(false);
        return service.delete(DetalleOrdenPedido.builder().codigo(id).build());
    }
}

