package com.edu.upeu.lp2exa1alisonvillarreal.dao;

import java.util.List;
import java.util.Map;

import com.edu.upeu.lp2exa1alisonvillarreal.entity.Detalle_pedido;


public interface Detalle_pedidoDao {
	int create ( Detalle_pedido d);
	int update ( Detalle_pedido d);
	int delete (int id);
	 Detalle_pedido read(int id);
	List<Map<String, Object>>realAll();


	
}
