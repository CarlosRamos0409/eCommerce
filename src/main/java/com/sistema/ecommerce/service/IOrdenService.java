package com.sistema.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.sistema.ecommerce.model.Orden;


public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	
}
