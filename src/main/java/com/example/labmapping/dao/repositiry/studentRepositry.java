package com.example.labmapping.dao.repositiry;

import com.example.labmapping.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepositry extends JpaRepository<Student, String> {
}
