package br.com.blueteam.gclub.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.blueteam.gclub.model.Pedido;

@RestController
public class PedidoController {

	@RequestMapping(value = "/pedido", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>  carrinho(@RequestBody Pedido pedido){
		return null;
	} 
}
