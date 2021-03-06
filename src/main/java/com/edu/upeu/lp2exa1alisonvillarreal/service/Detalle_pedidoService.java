package com.edu.upeu.lp2exa1alisonvillarreal.service;

import java.util.List;
import java.util.Map;

import com.edu.upeu.lp2exa1alisonvillarreal.entity.Detalle_pedido;

public interface Detalle_pedidoService {
	int create(Detalle_pedido d);

    int update(Detalle_pedido d);

    int delete(int id);

    Detalle_pedido read(int id);

    List<Map<String, Object>> readAll();

}


