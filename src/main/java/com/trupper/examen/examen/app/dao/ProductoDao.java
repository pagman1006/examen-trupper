package com.trupper.examen.examen.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trupper.examen.examen.app.dao.model.Producto;

public interface ProductoDao extends JpaRepository<Producto, Integer> {

}
