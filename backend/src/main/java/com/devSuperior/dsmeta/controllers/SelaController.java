package com.devSuperior.dsmeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Page<Sale> findSales(
			@RequestParam(value = "minDate", defaultValue = "")String minDate, 
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate, 
			Pageable pageable){
		return service.findSales(minDate, maxDate, pageable);
	}

}
