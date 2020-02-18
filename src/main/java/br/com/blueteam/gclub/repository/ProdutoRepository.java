package br.com.blueteam.gclub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.blueteam.gclub.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long>{

}
