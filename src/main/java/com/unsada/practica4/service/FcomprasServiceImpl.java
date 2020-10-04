package com.unsada.practica4.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsada.practica4.dao.FcomprasDao;
import com.unsada.practica4.modelo.Fcompras;
@Service
public class FcomprasServiceImpl implements FcomprasServiceApi {
	@Autowired
	private FcomprasDao fcomprasDao;
	
	@Override
	public <S extends Fcompras> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Fcompras> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Fcompras> findById(Long id) {
		// TODO Auto-generated method stub
		return fcomprasDao.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Fcompras> findAll() {
		// TODO Auto-generated method stub
		return fcomprasDao.findAll();
	}

	@Override
	public Iterable<Fcompras> findAllById(Iterable<Long> ids) {
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
	public void delete(Fcompras entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Fcompras> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	

}
