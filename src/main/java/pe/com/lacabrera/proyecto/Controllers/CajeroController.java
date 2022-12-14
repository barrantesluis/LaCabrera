
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
import pe.com.lacabrera.proyecto.entity.Cajero;
import pe.com.lacabrera.proyecto.service.CajeroService;


@RestController
@RequestMapping("/cajero")
public class CajeroController {
    
    @Autowired
    private CajeroService service;
    
    @GetMapping
    public List<Cajero> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<Cajero> findAllCustom(){
        return service.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Cajero> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public Cajero add(@RequestBody Cajero p){
        return service.add(p);
    }
    @PutMapping("/{id}")
    public Cajero update(@PathVariable long id,@RequestBody Cajero p){
        p.setCodigo(id);
        return service.update(p);
    }
    @DeleteMapping("/{id}")
    public Cajero delete(@PathVariable long id){
        Cajero objCajero = new Cajero();
        objCajero.setEstado(false);
        return service.delete(Cajero.builder().codigo(id).build());
    }
}
