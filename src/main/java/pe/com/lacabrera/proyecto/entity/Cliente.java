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
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Cliente")
@Table(name = "Cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "idcliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nombrecliente")
    private String nombre;
    @Column(name = "numero")
    private String numcli;
    @Column(name = "emailcliente")
    private String emailcli;
    @Column(name = "estado")
    private boolean estado;
}
