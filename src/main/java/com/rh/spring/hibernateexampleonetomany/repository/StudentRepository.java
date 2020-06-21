package com.rh.spring.hibernateexampleonetomany.repository;

import com.rh.spring.hibernateexampleonetomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
