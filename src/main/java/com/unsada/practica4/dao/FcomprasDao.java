package com.unsada.practica4.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.unsada.practica4.modelo.Fcompras;
@Transactional
public interface FcomprasDao extends CrudRepository<Fcompras, Long> {

}
