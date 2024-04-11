package com.example.labmapping.dao.repositiry;

import com.example.labmapping.dao.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface professorRepositry extends JpaRepository<Professor, Date> {
}
