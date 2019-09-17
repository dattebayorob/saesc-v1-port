package com.dtb.saescapiold.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dtb.saescapiold.model.entities.EscolaV2;
import com.dtb.saescapiold.model.repositories.EscolaV2Repository;
import com.dtb.saescapiold.service.EscolaV2Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EscolaV2ServiceImpl implements EscolaV2Service {
	private final EscolaV2Repository repository;

	@Override
	public Page<EscolaV2> buscarTodas(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public EscolaV2 adicionar(EscolaV2 escolaV2) {
		return repository.save(escolaV2);
	}
	
	
}
