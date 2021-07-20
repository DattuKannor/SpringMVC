package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entty.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
