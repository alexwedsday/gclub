package br.com.blueteam.gclub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.blueteam.gclub.model.Programacao;
import br.com.blueteam.gclub.repository.ProgramacaoRepository;

@Service
public class ProgramacaoService {

	@Autowired
	ProgramacaoRepository repository;

	public ResponseEntity<List<Programacao>> cadastrar(List<Programacao> programacao) {
		return ResponseEntity.ok((List<Programacao>) repository.saveAll(programacao));

	}

	public ResponseEntity<Programacao> cadastrar(Programacao programacao) {
		return ResponseEntity.ok(repository.save(programacao));
	}

	public ResponseEntity<?> buscar(Long id) {
		Optional<Programacao> programacao = null;
		if (repository.existsById(id)) {
			programacao = repository.findById(id);
		}else {
			return ResponseEntity.ok(new br.com.blueteam.gclub.model.Error<Programacao>("404", String.format("%d - Programação Inexistente", id)));
		}
		return ResponseEntity.of(programacao);

	}

	public ResponseEntity<List<Programacao>> todos() {
		return ResponseEntity.ok((List<Programacao>) repository.findAll());
	}
}
