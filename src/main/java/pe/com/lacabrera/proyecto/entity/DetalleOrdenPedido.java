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
@Entity(name = "detalle_orden_pedido")
@Table(name = "detalle_orden_pedido")
public class DetalleOrdenPedido implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "iddeor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "precio")
    private double precio;
    @Column(name = "cantidad")
    private int cantidad;    
    @Column(name = "estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="idordenpedido",nullable=false)
    private OrdenPedido ordenpedido;
    @ManyToOne
    @JoinColumn(name="idproducto",nullable=false)
    private Producto producto;
}
