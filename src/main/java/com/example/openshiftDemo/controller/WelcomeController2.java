package com.example.openshiftDemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController2 {

	@RequestMapping("/greeting2")
	public String getName(@RequestParam(value="name", defaultValue="World") String a) {
		return a;
	}
}
