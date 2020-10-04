package com.unsada.practica4.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsada.practica4.dao.ProveedorDao;
import com.unsada.practica4.modelo.Proveedor;
@Service
public class ProveedorServiceImpl implements ProveedorServiceApi {
	
	
	@Autowired
	private ProveedorDao proveedorDao;

	@Override
	public <S extends Proveedor> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Proveedor> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Proveedor> findById(Long id) {
		// TODO Auto-generated method stub
		return proveedorDao.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return proveedorDao.findAll();
	}

	@Override
	public Iterable<Proveedor> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Proveedor entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Proveedor> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}



}
