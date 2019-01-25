package com.dtb.saescapiold.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtb.saescapiold.model.entities.EscolaIp;
import com.dtb.saescapiold.model.repositories.EscolaIpRepository;
import com.dtb.saescapiold.service.EscolaIpService;

@Service
public class EscolaIpServiceImpl implements EscolaIpService{
	@Autowired
	private EscolaIpRepository ipRepository;
	
	public EscolaIp buscarPelaEscola(Long id) {
		return ipRepository.findByEscolaId(id);
	}
}
