package com.unsada.practica4.service;

import org.springframework.data.repository.CrudRepository;


import com.unsada.practica4.modelo.Articulo;

public interface ArticuloServiceApi extends CrudRepository<Articulo, Long> {

}
