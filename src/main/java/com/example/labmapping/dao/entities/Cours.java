package com.example.labmapping.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    //Relation entre cour et seance
    @OneToMany(mappedBy = "cours")
    private Collection<Seance> seances;

    //Relation entre cour et professor
    @OneToOne(mappedBy = "cours")
    private Professor professeur;
}
