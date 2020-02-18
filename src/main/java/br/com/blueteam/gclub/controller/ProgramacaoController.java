package br.com.blueteam.gclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.blueteam.gclub.controller.pattern.ProgramacaoWrapper;
import br.com.blueteam.gclub.model.Programacao;
import br.com.blueteam.gclub.service.ProgramacaoService;

@RestController
public class ProgramacaoController {

	@Autowired
	ProgramacaoService service;

	@RequestMapping(value = "/programacao/seeders", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> popular(@RequestBody ProgramacaoWrapper programacao) {
		return service.cadastrar(programacao.getProgramacao());
	}
	
	@RequestMapping(value = "/programacao", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> popular(@RequestBody Programacao programacao) {
		return service.cadastrar(programacao);
	}
	
	@RequestMapping(value = "/programacao/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscar(@PathVariable("id")Long id){
		return service.buscar(id);
	}
	
	@RequestMapping(value = "/programacao", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> buscarTodos(){
		return service.todos();
	}
	
}
