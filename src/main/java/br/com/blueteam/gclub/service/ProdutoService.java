package br.com.blueteam.gclub.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.blueteam.gclub.model.Produto;
import br.com.blueteam.gclub.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository repository;
	
	public ResponseEntity<Produto> cadastrar(Produto produto){
		return ResponseEntity.ok(repository.save(produto));
	} 
	
	public ResponseEntity<List<Produto>> Cadastrar(List<Produto> produtos){
		return ResponseEntity.ok((List<Produto>)repository.saveAll(produtos));
	
	}

}
