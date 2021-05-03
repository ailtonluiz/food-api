package com.ailtonluiz.food.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.ailtonluiz.food.FoodApiApplication;
import com.ailtonluiz.food.domain.model.Cozinha;
import com.ailtonluiz.food.domain.repository.CozinhaRepository;

public class ExclusaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(FoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		
		cozinhaRepository.remover(cozinha);
	}
	
}
