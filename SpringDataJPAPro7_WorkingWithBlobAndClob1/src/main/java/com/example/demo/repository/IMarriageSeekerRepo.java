package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.MarriageSeeker;

public interface IMarriageSeekerRepo extends PagingAndSortingRepository<MarriageSeeker, Long> {

}
