package com.generation.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-objetivos")
public class listaController {

	@GetMapping
	public String listaobjetivos() {
		return "Estudar mais Banco de dados;/n - terminar os exercicios da Generation; /n - Estudar sobre Spring ";
	}
}
