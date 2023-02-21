package com.devsuperior.CrudClientes.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.CrudClientes.dto.ClienteDTO;
import com.devsuperior.CrudClientes.entities.Cliente;
import com.devsuperior.CrudClientes.services.ClienteService;


@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> findAll() {
		List<ClienteDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	

	}
	

}
