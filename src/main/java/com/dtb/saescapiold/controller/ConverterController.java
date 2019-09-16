package com.dtb.saescapiold.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtb.saescapiold.service.EscolaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/converter")
@RequiredArgsConstructor
public class ConverterController {
	private final EscolaService escolaService;

	@GetMapping("/todos")
	public ResponseEntity<String> converterTodos() {
		return ResponseEntity.ok(escolaService.converterTodas()+" convertidas");
	}
}