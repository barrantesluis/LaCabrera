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
import pe.com.lacabrera.proyecto.entity.OrdenPedido;
import pe.com.lacabrera.proyecto.service.OrdenPedidoService;


@RestController
@RequestMapping("/ordenpedido")
public class OrdenPedidoController {
    @Autowired
    private OrdenPedidoService service;
    
    @GetMapping
    public List<OrdenPedido> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<OrdenPedido> findAllCustom(){
        return service.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<OrdenPedido> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public OrdenPedido add(@RequestBody OrdenPedido p){
        return service.add(p);
    }
    @PutMapping("/{id}")
    public OrdenPedido update(@PathVariable long id,@RequestBody OrdenPedido p){
        p.setCodigo(id);
        return service.update(p);
    }
    @DeleteMapping("/{id}")
    public OrdenPedido delete(@PathVariable long id){
        OrdenPedido objorden = new OrdenPedido();
        objorden.setEstado(false);
        return service.delete(OrdenPedido.builder().codigo(id).build());
    }
}
