package com.unsada.practica4.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.unsada.practica4.modelo.Proveedor;

public interface ProveedorServiceApi extends CrudRepository<Proveedor, Long> {

}
