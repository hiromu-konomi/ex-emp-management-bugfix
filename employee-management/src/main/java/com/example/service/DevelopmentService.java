package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Development;
import com.example.repository.DevelopmentRepository;

@Service
@Transactional
public class DevelopmentService {

	@Autowired
	private DevelopmentRepository repository;

	public Development load(Integer developmentId) {
		return repository.load(developmentId);
	}

	public List<Development> findAll() {
		return repository.findAll();
	}

	public Development save(Development development) {
		return repository.save(development);
	}

	public void delete(Integer developmentId) {
		repository.delete(developmentId);
	}
}
