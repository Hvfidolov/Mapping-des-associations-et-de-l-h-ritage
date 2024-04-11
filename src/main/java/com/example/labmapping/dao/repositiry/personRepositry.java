package com.example.labmapping.dao.repositiry;

import com.example.labmapping.dao.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personRepositry extends JpaRepository<Personne,Long> {
}
