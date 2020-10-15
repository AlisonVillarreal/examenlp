package com.edu.upeu.lp2exa1alisonvillarreal.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.upeu.lp2exa1alisonvillarreal.entity.Detalle_pedido;
import com.edu.upeu.lp2exa1alisonvillarreal.service.Detalle_pedidoService;

import com.edu.upeu.lp2exa1alisonvillarreal.dao.Detalle_pedidoDao;
@Service
public class Detalle_pedidoServiceImpl  implements Detalle_pedidoService{
@Autowired
private Detalle_pedidoDao detalle_pedidoDao;

@Override
public int create(Detalle_pedido d) {
	// TODO Auto-generated method stub
	return detalle_pedidoDao.create(d);
}

@Override
public int update(Detalle_pedido d) {
	// TODO Auto-generated method stub
	return detalle_pedidoDao.update(d);
}

@Override
public int delete(int id) {
	// TODO Auto-generated method stub
	return detalle_pedidoDao.delete(id);
}

@Override
public Detalle_pedido read(int id) {
	// TODO Auto-generated method stub
	return detalle_pedidoDao.read(id);
}

@Override
public List<Map<String, Object>> readAll() {
	// TODO Auto-generated method stub
	return detalle_pedidoDao.realAll();
}

}
