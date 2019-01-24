package com.dtb.saescapiold.model.repositories;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dtb.saescapiold.model.entities.EscolaIp;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EscolaIpRepositoryTest {
	@Autowired
	private EscolaIpRepository ipRepository;
private static final Log log = LogFactory.getLog(EscolaRepositoryTest.class);
	
	@Before
	public void init() {
		log.info("Iniciando testes para EscolaIpRepository");
	}
	
	@Test
	public void testFindAll() {
		List<EscolaIp> ips = ipRepository.findAll();
		System.out.println(ips.size());
		assertFalse(ips.isEmpty());
		//assertTrue(ips.size() == 182);
	}
}
