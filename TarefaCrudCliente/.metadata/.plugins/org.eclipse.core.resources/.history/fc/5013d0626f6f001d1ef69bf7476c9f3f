package com.devsuperior.CrudClientes.services;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.CrudClientes.entities.Cliente;
import com.devsuperior.CrudClientes.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	@Transactional(readOnly = true)
	public List<Cliente> findAll(){
		return repository.findAll();	}

}
