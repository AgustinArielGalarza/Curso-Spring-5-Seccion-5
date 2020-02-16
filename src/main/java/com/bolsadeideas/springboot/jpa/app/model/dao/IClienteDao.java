package com.bolsadeideas.springboot.jpa.app.model.dao;

import java.util.List;

import com.bolsadeideas.springboot.jpa.app.model.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();
	
	public void save(Cliente cliente);
}
