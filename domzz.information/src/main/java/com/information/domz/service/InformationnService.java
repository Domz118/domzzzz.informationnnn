package com.information.domz.service;

import java.util.List;

import com.information.domz.model.Informationnn;

public interface InformationnService {

	public List<Informationnn> getAllInformationnn();

	Informationnn getById(Long id);

	public void saveOrUpdate(Informationnn information);

	public void deleteInformationnn(Long id);
}
