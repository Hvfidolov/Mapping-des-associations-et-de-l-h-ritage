package com.example.labmapping.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@DiscriminatorValue("PROF")
public class Professor extends Personne {

    private Date d_affection;

    //Relation entre cour et professor

    @OneToOne
    private Cours cours;
}
