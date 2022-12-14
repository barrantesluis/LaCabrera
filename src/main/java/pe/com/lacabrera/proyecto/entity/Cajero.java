package pe.com.lacabrera.proyecto.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "cajero")
@Table(name = "cajero")
public class Cajero implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idcajero")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nombrecajero")
    private String nombre;
    @Column(name="telefono")
    private String telefono;
    @Column(name="emailcajero")
    private String email;
    @Column(name="estado")
    private Boolean estado;
}