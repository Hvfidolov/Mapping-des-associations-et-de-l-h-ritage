package com.example.labmapping.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@DiscriminatorValue("ETUD")
public class Student extends Personne{

    private String matricule;

    //Relation entre student et seance
    @ManyToMany(mappedBy = "students", fetch = FetchType.EAGER)
    private Collection<Seance> seances = new ArrayList<>();
}
