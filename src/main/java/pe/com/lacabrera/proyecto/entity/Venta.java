package pe.com.lacabrera.proyecto.entity;

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
@Entity(name = "venta")
@Table(name = "venta")
public class Venta {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idventa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "metodopago")
    private String metodopago;
    @Column(name = "propina")
    private double propina;
    @Column(name = "descuento")
    private double descuento;
    @Column(name = "total")
    private double total;
    @Column(name = "estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="idcajero",nullable=false)
    private Cajero cajero;
}
