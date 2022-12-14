package pe.com.lacabrera.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "orden_pedido")
@Table(name = "orden_pedido")
public class OrdenPedido implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idordenpedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "fechapedido")
    private String fecha;
    @Column(name = "montototal")
    private double monto;
    @Column(name = "estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="idcliente",nullable=false)
    private Cliente cliente;
}
