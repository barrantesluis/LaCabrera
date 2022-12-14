/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.lacabrera.proyecto.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lacabrera.proyecto.entity.DetalleOrdenPedido;
import pe.com.lacabrera.proyecto.repository.DetalleOrdenPedidoRepository;

@Service
public class DetalleOrdenPedidoServiceImpl implements DetalleOrdenPedidoService{
    
    @Autowired
    private DetalleOrdenPedidoRepository repository;

    @Override
    public List<DetalleOrdenPedido> findAll() {
        return repository.findAll();
    }

    @Override
    public List<DetalleOrdenPedido> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public DetalleOrdenPedido add(DetalleOrdenPedido p) {
        return repository.save(p);
    }

    @Override
    public DetalleOrdenPedido update(DetalleOrdenPedido p) {
        DetalleOrdenPedido objDetalleOrdenPedido = repository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objDetalleOrdenPedido);
        return repository.save(objDetalleOrdenPedido);
    }

    @Override
    public DetalleOrdenPedido delete(DetalleOrdenPedido p) {
        DetalleOrdenPedido objDetalleOrdenPedido = repository.getById(p.getCodigo());
        objDetalleOrdenPedido.setEstado(false);
        return repository.save(objDetalleOrdenPedido);
    }

    @Override
    public Optional<DetalleOrdenPedido> findById(Long id) {
        return repository.findById(id);    
    }
}
