package com.example.labmapping.dao.repositiry;

import com.example.labmapping.dao.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface coursRepositry extends JpaRepository<Cours, Integer> {
}
