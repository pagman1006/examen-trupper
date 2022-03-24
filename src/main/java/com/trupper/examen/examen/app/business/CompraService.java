package com.trupper.examen.examen.app.business;

import java.util.List;

import com.trupper.examen.examen.app.dao.model.Orden;

public interface CompraService {
	
	public Orden guardarOrden(Orden ordenCompra);
	public Orden obtenerOrdenPorId(Integer ordenId);
	public List<Orden> listarOrdenes();

}
