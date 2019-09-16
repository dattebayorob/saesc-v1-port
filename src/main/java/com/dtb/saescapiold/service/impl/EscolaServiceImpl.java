package com.dtb.saescapiold.service.impl;

import org.springframework.stereotype.Service;

import com.dtb.saescapiold.model.converters.ConverterEntidades;
import com.dtb.saescapiold.model.entities.EscolaV2;
import com.dtb.saescapiold.model.repositories.EscolaRepository;
import com.dtb.saescapiold.service.EscolaIpService;
import com.dtb.saescapiold.service.EscolaService;
import com.dtb.saescapiold.service.EscolaV2Service;
import com.dtb.saescapiold.service.LinkService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@AllArgsConstructor
public class EscolaServiceImpl implements EscolaService{
	private final EscolaRepository escolaRepository;
	private final EscolaV2Service v2Service;
	private final LinkService linkService;
	private final EscolaIpService ipService;
	private final ConverterEntidades converter;
	
	@Override
	public Long converterTodas() {
		return escolaRepository
				.findAll()
				.stream()
				.peek(escola -> {
					log.info("Convertendo escola: {}", escola);
					EscolaV2 v2 = v2Service.adicionar(converter.toV2(escola));
					log.info("Nova entidade escola gerada de Id: {}", escola.getId());
					converter.converterLinks(v2.getId(), ipService.buscarPelaEscola(escola.getId()))
							.forEach(link -> {
								linkService.adicionar(link);
								log.info("Link adicionado para a escola :{}",escola.getNome());
								});
				})
				.count();
	}
}
