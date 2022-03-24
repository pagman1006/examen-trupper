package com.trupper.examen.examen.app.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trupper.examen.examen.app.business.CompraService;
import com.trupper.examen.examen.app.dao.OrdenDao;
import com.trupper.examen.examen.app.dao.ProductoDao;
import com.trupper.examen.examen.app.dao.SucursalDao;
import com.trupper.examen.examen.app.dao.model.Orden;

@Service("compraService")
public class CompraServiceImpl implements CompraService {

	@Autowired
	private OrdenDao ordenDao;
	
	@Autowired
	private ProductoDao productoDao;
	
	@Autowired
	private SucursalDao sucursalDao;
	
	@Override
	public Orden guardarOrden(Orden ordenCompra) {
		productoDao.saveAll(ordenCompra.getProductos());
		sucursalDao.save(ordenCompra.getSucursal());
		ordenDao.save(ordenCompra);
		return ordenCompra;
	}

	@Override
	public Orden obtenerOrdenPorId(Integer ordenId) {
		Orden orden = ordenDao.findById(ordenId).orElse(null);
		return orden;
	}

	@Override
	public List<Orden> listarOrdenes() {
		return ordenDao.findAll();
	}

}
