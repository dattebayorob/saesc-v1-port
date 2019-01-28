package com.dtb.saescapiold.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtb.saescapiold.model.converters.ConverterEntidades;
import com.dtb.saescapiold.model.entities.Escola;
import com.dtb.saescapiold.model.entities.EscolaV2;
import com.dtb.saescapiold.service.EscolaIpService;
import com.dtb.saescapiold.service.EscolaService;
import com.dtb.saescapiold.service.EscolaV2Service;
import com.dtb.saescapiold.service.LinkService;

@RestController
@RequestMapping(value = "/converter")
public class ConverterController {
	@Autowired
	private EscolaService escolaService;
	@Autowired
	private EscolaV2Service v2Service;
	@Autowired
	private LinkService linkService;
	@Autowired
	private EscolaIpService ipService;
	private static ConverterEntidades converter = new ConverterEntidades();

	@GetMapping("/todos")
	public ResponseEntity<String> converterTodos() {
		List<Escola> escolas = escolaService.buscarTodas();
		escolas.forEach(escola -> {
			EscolaV2 v2 = v2Service.adicionar(converter.toV2(escola));
			converter.converterLinks(v2.getId(),ipService.buscarPelaEscola(escola.getId()))
					.forEach(link -> linkService.adicionar(link));
		});
		return ResponseEntity.ok().body(escolas.size()+" Convertidas");
	}
}