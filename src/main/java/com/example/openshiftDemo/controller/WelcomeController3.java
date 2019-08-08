package com.example.openshiftDemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController3 {

	@RequestMapping("/greetingMessage")
	public String getName(@RequestParam(value="name", defaultValue="World") String a) {
		return a+" welcome to codier group";
	}
}
