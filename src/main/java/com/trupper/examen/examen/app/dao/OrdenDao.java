package com.trupper.examen.examen.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trupper.examen.examen.app.dao.model.Orden;

public interface OrdenDao extends JpaRepository<Orden, Integer> {

}
