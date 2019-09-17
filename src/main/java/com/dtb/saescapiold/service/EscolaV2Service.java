package com.dtb.saescapiold.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dtb.saescapiold.model.entities.EscolaV2;

public interface EscolaV2Service {
	public Page<EscolaV2> buscarTodas(Pageable pageable);
	public EscolaV2 adicionar(EscolaV2 escolaV2);
}
