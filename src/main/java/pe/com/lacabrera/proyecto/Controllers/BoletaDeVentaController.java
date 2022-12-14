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
import pe.com.lacabrera.proyecto.entity.BoletaDeVenta;
import pe.com.lacabrera.proyecto.service.BoletaDeVentaPedidoService;


@RestController
@RequestMapping("/boletaventa")
public class BoletaDeVentaController {
    
    @Autowired
    private BoletaDeVentaPedidoService service;
    
    @GetMapping
    public List<BoletaDeVenta> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<BoletaDeVenta> findAllCustom(){
        return service.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<BoletaDeVenta> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public BoletaDeVenta add(@RequestBody BoletaDeVenta p){
        return service.add(p);
    }
    @PutMapping("/{id}")
    public BoletaDeVenta update(@PathVariable long id,@RequestBody BoletaDeVenta p){
        p.setCodigo(id);
        return service.update(p);
    }
    @DeleteMapping("/{id}")
    public BoletaDeVenta delete(@PathVariable long id){
        BoletaDeVenta objBoletaDeVenta = new BoletaDeVenta();
        objBoletaDeVenta.setEstado(false);
        return service.delete(BoletaDeVenta.builder().codigo(id).build());
    }
}
