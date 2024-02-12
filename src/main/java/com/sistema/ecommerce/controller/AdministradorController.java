package com.sistema.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sistema.ecommerce.model.Producto;
import com.sistema.ecommerce.service.IProductoService;
import com.sistema.ecommerce.service.IUsuarioService;

@Controller
@RequestMapping("/administrador")

public class AdministradorController {
@Autowired
	private IProductoService productoService;

@Autowired
private IUsuarioService usuarioService;
	
	@GetMapping("")
public String home(Model model) {
	List<Producto> productos=productoService.findAll();
	model.addAttribute("productos", productos);
	return "administrador/home";
}
	
	@GetMapping("/usuarios")
	public String usuarios(Model model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		return "administrador/usuarios";
	}
}
