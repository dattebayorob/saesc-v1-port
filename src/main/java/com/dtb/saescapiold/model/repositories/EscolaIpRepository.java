package com.dtb.saescapiold.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dtb.saescapiold.model.entities.EscolaIp;

public interface EscolaIpRepository extends JpaRepository<EscolaIp, Long>{
	EscolaIp findByEscolaId(Long id);
}
