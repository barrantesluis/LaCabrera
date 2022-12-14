
package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import pe.com.lacabrera.proyecto.entity.Cliente;

public interface ClienteServie {
    public List<Cliente> findAll();

    public List<Cliente> findAllCustom();

    public Optional<Cliente> findById(Long id);

    public Cliente add(Cliente c);

    public Cliente update(Cliente c);

    public Cliente delete(Cliente c);
}
