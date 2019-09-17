package com.dtb.saescapiold.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dtb.saescapiold.model.entities.EscolaV2;

public interface EscolaService {
	Long converterTodas();
	Page<EscolaV2> buscarEscolasConvertidasPaginado(Pageable pageable);
}
