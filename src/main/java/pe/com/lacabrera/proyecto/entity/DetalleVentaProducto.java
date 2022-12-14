package pe.com.lacabrera.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "DetalleVentaProductoEntity")
@Table(name = "DetalleVentaProducto")
*/public class DetalleVentaProducto implements Serializable{
  /*  private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "iddeven")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nompro")
    private String nombre;
    @Column(name = "preproc")
    private double precioCompra;
    @Column(name = "preprov")
    private double precioVenta;
    @Column(name = "canpro")
    private int cantidad;
    @Column(name = "estpro")
    private boolean estado;
    @ManyToMany
    @JoinColumn(name="idventa",nullable=false)
    private Venta venta;
    @ManyToMany
    @JoinColumn(name="idproducto",nullable=false)
    private Producto producto;
*/
}
