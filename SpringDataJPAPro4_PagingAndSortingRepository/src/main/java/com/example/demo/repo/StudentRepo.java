package com.example.demo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.Student;

public interface StudentRepo extends PagingAndSortingRepository<Student, Integer> {


}
