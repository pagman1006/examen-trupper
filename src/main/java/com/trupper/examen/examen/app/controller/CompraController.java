package com.trupper.examen.examen.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trupper.examen.examen.app.business.CompraService;
import com.trupper.examen.examen.app.dao.model.Orden;

@RestController
public class CompraController {

	@Autowired
	private CompraService compraService;
	
	@PostMapping("/compra/orden")
	public Orden guardarOrden(@RequestBody Orden compra) {
		
		return compraService.guardarOrden(compra);
	}
	
	@GetMapping("/compra/orden")
	public List<Orden> listarOrdenes() {
		
		return compraService.listarOrdenes();
	}
	
	@GetMapping("/compra/orden/{id}")
	public Orden obtenerOrden(@PathVariable(name = "id") Integer id) {
		return compraService.obtenerOrdenPorId(id);
	}
	
}
