package br.com.blueteam.gclub.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.blueteam.gclub.model.Endereco;

@RestController
public class EnderecoController {

	@RequestMapping(value = "/endereco", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrar(@RequestBody Endereco endereco){
		return null;
	}
	
	@RequestMapping(value = "/endereco/{cep}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscar(@PathVariable("cep") String cep){
		return null;
	} 
}
