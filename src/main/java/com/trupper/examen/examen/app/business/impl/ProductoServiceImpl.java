package com.trupper.examen.examen.app.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trupper.examen.examen.app.business.ProductoService;
import com.trupper.examen.examen.app.dao.ProductoDao;
import com.trupper.examen.examen.app.dao.model.Producto;

@Service("productoService")
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoDao productoDao;
	
	@Override
	public Producto actualizarProducto(Producto producto) {
		Producto productoActualizado = productoDao.getById(producto.getProductoId());
		productoActualizado.setPrecio(producto.getPrecio());
		return productoActualizado;
	}

}
