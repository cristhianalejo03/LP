package pe.edu.upeu.sysalmacen.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "upeu_marca")

public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idMarca;

    @Column(nullable = false)
    public String nombre;

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
