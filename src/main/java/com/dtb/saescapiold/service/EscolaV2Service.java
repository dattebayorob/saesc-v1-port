package com.dtb.saescapiold.service;

import java.util.List;

import com.dtb.saescapiold.model.entities.EscolaV2;

public interface EscolaV2Service {
	public List<EscolaV2> buscarTodas();
	public EscolaV2 adicionar(EscolaV2 escolaV2);
}
