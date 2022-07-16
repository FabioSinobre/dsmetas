package com.devSuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devSuperior.dsmeta.entities.Sale;
import com.devSuperior.dsmeta.repositories.SaleRepository;

@Service //indica que é um componente do sistema
public class SaleServices {
	
	@Autowired //faz import de quem acessa o BD
	private SaleRepository repository;
	
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
