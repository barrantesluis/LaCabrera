
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
import pe.com.lacabrera.proyecto.entity.Venta;
import pe.com.lacabrera.proyecto.service.VentaService;


@RestController
@RequestMapping("/venta")
public class VentaController {
    
    @Autowired
    private VentaService service;
    
    @GetMapping
    public List<Venta> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<Venta> findAllCustom(){
        return service.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<Venta> findById(@PathVariable Long id){
        return service.findById(id);
    }
    @PostMapping
    public Venta add(@RequestBody Venta p){
        return service.add(p);
    }
    @PutMapping("/{id}")
    public Venta update(@PathVariable long id,@RequestBody Venta p){
        p.setCodigo(id);
        return service.update(p);
    }
    @DeleteMapping("/{id}")
    public Venta delete(@PathVariable long id){
        Venta objVenta = new Venta();
        objVenta.setEstado(false);
        return service.delete(Venta.builder().codigo(id).build());
    }
}
