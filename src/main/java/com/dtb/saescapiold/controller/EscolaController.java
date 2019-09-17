package com.dtb.saescapiold.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtb.saescapiold.model.entities.EscolaV2;
import com.dtb.saescapiold.service.EscolaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/escolas")
@RequiredArgsConstructor
public class EscolaController {
	private final EscolaService service;
	@GetMapping
	public ResponseEntity<Page<EscolaV2>> buscarEscolasConvertidas(
			@PageableDefault(page = 0, size = 20, sort = "nome", direction = Direction.ASC) Pageable pageable){
		return ResponseEntity.ok(service.buscarEscolasConvertidasPaginado(pageable));
	}
}
