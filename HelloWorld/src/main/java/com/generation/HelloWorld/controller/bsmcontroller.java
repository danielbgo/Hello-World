package com.generation.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class bsmcontroller {

	@GetMapping
	public String bsm() {
		return "Comunicação, Proatividade, Orientação ao Detalhe e Trabalho em Equipe ";
	}
}
