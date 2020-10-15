package com.edu.upeu.lp2exa1alisonvillarreal.service;

import java.util.List;
import java.util.Map;

import com.edu.upeu.lp2exa1alisonvillarreal.entity.Usuario;

public interface UsuarioService {
	int create(Usuario u);

    int update(Usuario u);

    int delete(int id);

    Usuario read(int id);

    List<Map<String, Object>> readAll();

}

