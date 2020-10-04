package com.unsada.practica4.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsada.practica4.dao.FventasDao;
import com.unsada.practica4.modelo.Fventas;
@Service
public class FventasServiceImpl implements FventasServiceApi {
	@Autowired
	private FventasDao fventasDao;
	@Override
	public <S extends Fventas> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Fventas> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Fventas> findById(Long id) {
		// TODO Auto-generated method stub
		return fventasDao.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Fventas> findAll() {
		// TODO Auto-generated method stub
		return fventasDao.findAll();
	}

	@Override
	public Iterable<Fventas> findAllById(Iterable<Long> ids) {
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
	public void delete(Fventas entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Fventas> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	

}
