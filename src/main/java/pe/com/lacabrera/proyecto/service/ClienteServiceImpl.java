package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lacabrera.proyecto.entity.Cliente;
import pe.com.lacabrera.proyecto.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteServie {

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public Cliente add(Cliente c) {
        return repository.save(c);
    }

    @Override
    public Cliente update(Cliente c) {
        Cliente objCliente = repository.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objCliente);
        return repository.save(objCliente);
    }

    @Override
    public Cliente delete(Cliente c) {
        Cliente objCliente = repository.getById(c.getCodigo());
        objCliente.setEstado(false);
        return repository.save(objCliente);
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return repository.findById(id);
    }
}
