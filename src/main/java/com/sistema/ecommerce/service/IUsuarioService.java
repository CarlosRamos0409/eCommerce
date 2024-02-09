package com.sistema.ecommerce.service;

import java.util.Optional;

import com.sistema.ecommerce.model.Usuario;

public interface IUsuarioService {
Optional<Usuario> findById(Integer id);
Usuario save (Usuario usuario);
}
