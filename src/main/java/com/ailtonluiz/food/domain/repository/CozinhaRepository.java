package com.ailtonluiz.food.domain.repository;

import java.util.List;

import com.ailtonluiz.food.domain.model.Cozinha;

public interface CozinhaRepository {

	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover(Cozinha cozinha);
	
}
