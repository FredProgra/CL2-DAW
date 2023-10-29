package edu.pe.cibertec.Cl2.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Farmaco")
public class Farmaco {
    @Id

    @Column(name = "IdFarmaco")
    private Integer id;
    @Column(name = "NomFarmaco")
    private String nombre;
    @Column(name="Precio")
    private double precio;
}
