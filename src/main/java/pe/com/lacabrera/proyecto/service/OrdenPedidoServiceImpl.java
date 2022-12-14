
package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lacabrera.proyecto.entity.OrdenPedido;
import pe.com.lacabrera.proyecto.repository.OrdenPedidoRepository;

@Service
public class OrdenPedidoServiceImpl implements OrdenPedidoService{
    @Autowired
    private OrdenPedidoRepository repository;

    @Override
    public List<OrdenPedido> findAll() {
        return repository.findAll();
    }

    @Override
    public List<OrdenPedido> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public Optional<OrdenPedido> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public OrdenPedido add(OrdenPedido p) {
        return repository.save(p);
    }

    @Override
    public OrdenPedido update(OrdenPedido p) {
        OrdenPedido objOrden = repository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objOrden);
        return repository.save(objOrden);
    }

    @Override
    public OrdenPedido delete(OrdenPedido p) {
        OrdenPedido objOrden = repository.getById(p.getCodigo());
        objOrden.setEstado(false);
        return repository.save(objOrden);
    }
}
