package com.vz.bimpaas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bimpaas")
public class ProductController {
	@GetMapping
	public String getMessage() {
		return "Hi friends, This is Java World...";
		
	}
}
