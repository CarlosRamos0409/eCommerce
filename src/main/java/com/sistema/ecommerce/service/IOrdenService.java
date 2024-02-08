package com.sistema.ecommerce.service;

import java.util.List;

import com.sistema.ecommerce.model.Orden;

public interface IOrdenService {
List<Orden> findAll();//se obtienen todas las ordenes
	Orden save(Orden orden);
	 
}
