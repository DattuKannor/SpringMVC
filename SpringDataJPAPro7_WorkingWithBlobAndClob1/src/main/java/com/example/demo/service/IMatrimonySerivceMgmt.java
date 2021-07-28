package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.MarriageSeeker;

public interface IMatrimonySerivceMgmt {
	public String registerMarriageSeeker(MarriageSeeker seeker);

	public Optional<MarriageSeeker> searchSeekerById(Long id);

}
