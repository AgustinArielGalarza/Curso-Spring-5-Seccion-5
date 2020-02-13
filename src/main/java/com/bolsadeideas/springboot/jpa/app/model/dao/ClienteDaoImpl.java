package com.bolsadeideas.springboot.jpa.app.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.jpa.app.model.entity.Cliente;

@Repository("clienteDaoJPA") //es un controlador que su cualidad es que muestra y acciona mejor en JPA con bbdd
public class ClienteDaoImpl implements IClienteDao{

	@PersistenceContext //se hace que persista el *em* segun el contexto
	private EntityManager em;
	
	@SuppressWarnings("unchecked") //quita el warning
	@Transactional(readOnly = true) //datos serrán de lectura
	@Override
	public List<Cliente> findAll() {
		return em.createQuery("from Cliente").getResultList(); //crea la query y lo parsea en tipo List para retornarlo
	}
	

}
