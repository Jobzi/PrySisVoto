package com.voto.app.web.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.voto.app.web.models.entities.Propuesta;

public interface IPropuestaDAO extends CrudRepository<Propuesta, Integer> {

}
