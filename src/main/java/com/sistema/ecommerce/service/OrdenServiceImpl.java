package com.sistema.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	// 0000010
		public String generarNumeroOrden() {
			String numeroConcatenado="";
			int numero=0;
			
			
			List<Orden> ordenes = findAll();
			
			List<Integer> numeros= new ArrayList<Integer>();
			
			ordenes.stream().forEach(o -> numeros.add(( o.getId())));
			
			if (ordenes.isEmpty()) {
				numero=1;
			}else {
				numero= numeros.stream().max(Integer::compare).get();
				numero++;
			}
			
			if (numero<10) { //0000001000
				numeroConcatenado="000000000"+String.valueOf(numero);
			}else if(numero<100) {
				numeroConcatenado="00000000"+String.valueOf(numero);
			}else if(numero<1000) {
				numeroConcatenado="0000000"+String.valueOf(numero);
			}else if(numero<10000) {
				numeroConcatenado="000000"+String.valueOf(numero);
			}		
						
			return numeroConcatenado;
			
		}

	@Override
	public Optional<Orden> findById(Integer id) {
		return ordenRepository.findById(id);
	}

}
