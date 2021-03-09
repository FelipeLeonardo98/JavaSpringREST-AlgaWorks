package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.*;

@RestController
public class ClienteController {
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		var cliente2 = new Cliente();
		
		cliente1.setId(1L);
		cliente1.setNome("Mario");
		cliente1.setEmail("mario@domain.com");
		cliente1.setTelefone("10101010");
		
		cliente2.setId(2L);
		cliente2.setNome("Luigi");
		cliente2.setEmail("luigi@domain.com");
		cliente2.setTelefone("202020");
		
		return  Arrays.asList(cliente1, cliente2);
	}

}
