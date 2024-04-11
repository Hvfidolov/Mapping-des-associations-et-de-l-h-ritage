package com.example.labmapping.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private Date h_debut;
    private Date h_fin;

    //Seance et Cour
    @ManyToOne
    private Cours cours;

    //relation entre seance et student
    @ManyToMany
    private Collection<Student> students = new ArrayList<>();
}
