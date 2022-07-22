package fr.diginamic.sandbox.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/person")
public class PersonController {

	@GetMapping("/hello")
	public Mono<String> sayHello(@RequestParam(required = false) final String name) {

		final var response = name != null ? "hello " + name : "wait, who are you again ?";

		return Mono.just(response);
	}
}