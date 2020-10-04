package com.unsada.practica4.service;

import org.springframework.data.repository.CrudRepository;


import com.unsada.practica4.modelo.Cliente;


public interface ClienteServiceApi extends CrudRepository<Cliente, Long> {

}
