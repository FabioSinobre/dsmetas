package com.devSuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devSuperior.dsmeta.entities.Sale;
import com.devSuperior.dsmeta.services.SaleServices;

// implementa a api disponibiliza os endpoint

@RestController
@RequestMapping(value = "/sales")
public class SelaController {
	
	@Autowired //uma das operações para fazer requisiões
	private SaleServices service;
	
	@GetMapping
	public List<Sale> findSales(){
		return service.findSales();
	}

}
