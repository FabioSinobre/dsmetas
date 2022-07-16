package com.devSuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.dsmeta.entities.Sale;

// Componente responsavel em acessar o BD
public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}