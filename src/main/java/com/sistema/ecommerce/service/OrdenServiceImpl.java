package com.sistema.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.ecommerce.model.Orden;
import com.sistema.ecommerce.repository.IOrdenRepository;

@Service
public class OrdenServiceImpl implements IOrdenService {

	@Autowired
	private IOrdenRepository ordenRepository;
	
	@Override
	public Orden save(Orden orden) {
		return ordenRepository.save(orden);
	}

	@Override
	public List<Orden> findAll() {
		
		return ordenRepository.findAll();
	}

	public String generarNumeroOrden() {
		int numero=0;
		
		String numeroConcatenado="";
		
		List <Orden> ordenes= findAll();
		
		
		return "numeroConcatenado";
	}
}
