package com.example.labmapping;

import com.example.labmapping.dao.entities.Cours;
import com.example.labmapping.dao.entities.Professor;
import com.example.labmapping.dao.entities.Seance;
import com.example.labmapping.dao.entities.Student;
import com.example.labmapping.dao.repositiry.coursRepositry;
import com.example.labmapping.dao.repositiry.personRepositry;
import com.example.labmapping.dao.repositiry.seanceRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Date;

@SpringBootApplication
public class LabMappingApplication implements CommandLineRunner {
    @Autowired
    private personRepositry personneRepository;
    @Autowired
    private coursRepositry coursRepository;
    @Autowired
    private seanceRepositry seanceRepository;
    public static void main(String[] args) {
        SpringApplication.run(LabMappingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Création d'un professeur
        Professor professor = new Professor();
        professor.setNom("prof1");
        professor.setDate_naissance(new Date());
        professor.setD_affection(new Date());

        // Création d' un deuxieme professeur
        Professor professor2 = new Professor();
        professor2.setNom("prof2");
        professor2.setDate_naissance(new Date());
        professor2.setD_affection(new Date());

        // Enregistrement du professeur dans la base de données
        personneRepository.save(professor);
        personneRepository.save(professor2);

        // Création d'un cours
        Cours cours = new Cours();
        cours.setTitle("JEE");
        cours.setProfesseur(professor);

        // Enregistrement du cours dans la base de données
        coursRepository.save(cours);

        // Création d'une séance
        Seance seance = new Seance();
        seance.setDate(new Date());
        seance.setH_debut(new Date());
        seance.setH_fin(new Date());
        seance.setCours(cours);

        // Enregistrement de la séance dans la base de données
        seanceRepository.save(seance);

        // Création d'un étudiant
        Student student = new Student();
        student.setNom("etud1");
        student.setDate_naissance(new Date());
        student.setMatricule("12345");

        // Enregistrement de l'étudiant dans la base de données
        personneRepository.save(student);

        // Ajout de l'étudiant à la séance
        seance.getStudents().add(student);
        seanceRepository.save(seance);


        // Modification du deuxieme professeur
        professor2.setNom("Said");
        personneRepository.save(professor2);

        System.out.println("Done");

    }
}