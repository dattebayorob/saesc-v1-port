package com.dtb.saescapiold.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtb.saescapiold.model.entities.EscolaV2;
import com.dtb.saescapiold.model.repositories.EscolaV2Repository;
import com.dtb.saescapiold.service.EscolaV2Service;

@Service
public class EscolaV2ServiceImpl implements EscolaV2Service {
	@Autowired
	private EscolaV2Repository repository;

	@Override
	public List<EscolaV2> buscarTodas() {
		return repository.findAll();
	}

	@Override
	public EscolaV2 adicionar(EscolaV2 escolaV2) {
		return repository.save(escolaV2);
	}
	
	
}
