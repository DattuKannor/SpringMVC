package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MarriageSeeker;
import com.example.demo.repository.IMarriageSeekerRepo;


@Service
public class MartrimonyServiceImpl implements IMatrimonySerivceMgmt {
	
	@Autowired
	private IMarriageSeekerRepo msRepo;

	@Override
	public String registerMarriageSeeker(MarriageSeeker seeker) {
		return "Marriage Seeker Info is saved with id value "+msRepo.save(seeker).getId();
	}

	@Override
	public Optional<MarriageSeeker> searchSeekerById(Long id) {
		return msRepo.findById(id);
	}

}
