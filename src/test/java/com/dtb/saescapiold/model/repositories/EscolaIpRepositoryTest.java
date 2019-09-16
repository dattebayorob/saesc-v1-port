package com.dtb.saescapiold.model.repositories;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dtb.saescapiold.model.entities.EscolaIp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class EscolaIpRepositoryTest {
	@Autowired
	private EscolaIpRepository ipRepository;
	private static Long ID_ESCOLA = Long.valueOf(3);

	@Before
	public void init() {
		log.info("Iniciando testes para EscolaIpRepository");
	}

	@Test
	public void testFindAll() {
		List<EscolaIp> ips = ipRepository.findAll();
		System.out.println(ips.size());
		assertFalse(ips.isEmpty());
		// assertTrue(ips.size() == 182);
	}

	@Test
	public void testFindByEscolaId() {
		EscolaIp ip = ipRepository.findByEscolaId(ID_ESCOLA);
		assertNotNull(ip);
	}
}
