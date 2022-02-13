package com.information.domz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.information.domz.model.Informationnn;
import com.information.domz.repository.InformationnRepository;


@Service
@Transactional

public class InformationServiceImplI implements InformationnService {

	@Autowired
	InformationnRepository repository;

	@Override
	public List<Informationnn> getAllInformationnn() {

		return (List<Informationnn>) repository.findAll();
	}

	@Override
	public Informationnn getById(Long id) {
		return repository.findById(id).get();

	}

	@Override
	public void saveOrUpdate(Informationnn information) {

	}

	@Override
	public void deleteInformationnn(Long id) {

	}

}
