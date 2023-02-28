package com.example.demo.repository;


import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ICiudadanoRepoImpl implements ICiudadanoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Ciudadano consultar(Integer id) {
		// TODO Auto-generated method stub
		
		return this.entityManager.find(Ciudadano.class, id);
	}


}
