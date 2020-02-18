package br.com.blueteam.gclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.blueteam.gclub.controller.pattern.ProdutoWrapper;
import br.com.blueteam.gclub.model.Produto;
import br.com.blueteam.gclub.service.ProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	ProdutoService service;

	@RequestMapping(value = "/produto", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cadastrar(@RequestBody @Nullable() Produto produto) {
		return service.cadastrar(produto);
	}

	@RequestMapping(value = "/produto/seeders", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> popular(@RequestBody ProdutoWrapper produtos) {
		return service.Cadastrar(produtos.getProdutos());

	}

}
