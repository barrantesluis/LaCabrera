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
import pe.com.lacabrera.proyecto.entity.BoletaDeVenta;
import pe.com.lacabrera.proyecto.repository.BoletaDeVentaRepository;


@Service
public class BoletaDeVentaServiceImpl implements BoletaDeVentaPedidoService{
   
    @Autowired
    private BoletaDeVentaRepository repository;

    @Override
    public List<BoletaDeVenta> findAll() {
        return repository.findAll();
    }

    @Override
    public List<BoletaDeVenta> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public Optional<BoletaDeVenta> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public BoletaDeVenta add(BoletaDeVenta p) {
        return repository.save(p);
    }

    @Override
    public BoletaDeVenta update(BoletaDeVenta p) {
        BoletaDeVenta objBoletaDeVenta = repository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objBoletaDeVenta);
        return repository.save(objBoletaDeVenta);
    }

    @Override
    public BoletaDeVenta delete(BoletaDeVenta p) {
        BoletaDeVenta objBoletaDeVenta = repository.getById(p.getCodigo());
        objBoletaDeVenta.setEstado(false);
        return repository.save(objBoletaDeVenta);
    }
}
