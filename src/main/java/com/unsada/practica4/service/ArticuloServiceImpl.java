package com.unsada.practica4.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsada.practica4.dao.ArticuloDao;
import com.unsada.practica4.modelo.Articulo;
@Service
public class ArticuloServiceImpl implements ArticuloServiceApi {
	
	@Autowired
	private ArticuloDao articuloDao;

	@Override
	public <S extends Articulo> S save(S entity) {
		// TODO Auto-generated method stub
	
		return null;
	}

	@Override
	public <S extends Articulo> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Articulo> findById(Long id) {
		// TODO Auto-generated method stub
		return articuloDao.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Articulo> findAll() {
		// TODO Auto-generated method stub
		return articuloDao.findAll();
	}

	@Override
	public Iterable<Articulo> findAllById(Iterable<Long> ids) {
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
	public void delete(Articulo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Articulo> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
