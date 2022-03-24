package com.trupper.examen.examen.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trupper.examen.examen.app.business.ProductoService;
import com.trupper.examen.examen.app.dao.model.Producto;

@RestController
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@PutMapping("/producto/{id}")
	public Producto actualizarProducto(@RequestBody Producto producto) {
		
		return productoService.actualizarProducto(producto);
	}
}
