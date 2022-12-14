
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
import pe.com.lacabrera.proyecto.entity.Producto;
import pe.com.lacabrera.proyecto.service.ProductoService;


@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService service;
    
    @GetMapping
    public List<Producto> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<Producto> findAllCustom(){
        return service.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public Producto add(@RequestBody Producto p){
        return service.add(p);
    }
    @PutMapping("/{id}")
    public Producto update(@PathVariable long id,@RequestBody Producto p){
        p.setCodigo(id);
        return service.update(p);
    }
    @DeleteMapping("/{id}")
    public Producto delete(@PathVariable long id){
        Producto objproducto = new Producto();
        objproducto.setEstado(false);
        return service.delete(Producto.builder().codigo(id).build());
    }
}
