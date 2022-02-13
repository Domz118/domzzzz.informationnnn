package com.information.domz.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.information.domz.model.Informationnn;
import com.information.domz.service.InformationnService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/apiii")
public class InformationController {

	@Autowired
	InformationnService service;
	
	@PostMapping("/savesss")
	public Informationnn save(@RequestBody Informationnn information) {
		service.saveOrUpdate(information);
		return information;
	}

	@GetMapping("/Listtt")
	public List<Informationnn> list() {
		return service.getAllInformationnn();
	}
	
	@GetMapping("/Listtt{id}")
	public Informationnn getById(@PathVariable Long Id) {
		return service.getById(Id);
	}

}
