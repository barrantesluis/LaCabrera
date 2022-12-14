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
import pe.com.lacabrera.proyecto.entity.Cliente;
import pe.com.lacabrera.proyecto.service.ClienteServie;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServie service;
    
    @GetMapping
    public List<Cliente> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<Cliente> findAllCustom(){
        return service.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public Cliente add(@RequestBody Cliente p){
        return service.add(p);
    }
    @PutMapping("/{id}")
    public Cliente update(@PathVariable long id,@RequestBody Cliente p){
        p.setCodigo(id);
        return service.update(p);
    }
    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable long id){
        Cliente objCajero = new Cliente();
        objCajero.setEstado(false);
        return service.delete(Cliente.builder().codigo(id).build());
    }
    
    
}
