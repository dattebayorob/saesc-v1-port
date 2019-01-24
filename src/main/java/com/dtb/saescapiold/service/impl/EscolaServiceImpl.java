package com.dtb.saescapiold.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtb.saescapiold.model.entities.Escola;
import com.dtb.saescapiold.model.repositories.EscolaRepository;
import com.dtb.saescapiold.service.EscolaService;

@Service
public class EscolaServiceImpl implements EscolaService{
	@Autowired
	private EscolaRepository escolaRepository;

	@Override
	public List<Escola> buscarTodas() {
		return escolaRepository.findAll();
	}
}
