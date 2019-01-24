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

import com.dtb.saescapiold.model.entities.Escola;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EscolaRepositoryTest {
	@Autowired
	private EscolaRepository repository;
	private static final Log log = LogFactory.getLog(EscolaRepositoryTest.class);
	
	@Before
	public void init() {
		log.info("Iniciando testes para EscolaRepository");
	}
	
	@Test
	public void testFindAll() {
		List<Escola> escolas = repository.findAll();
		assertFalse(escolas.isEmpty());
		// Existem 182 registros no banco de dados antigo.
		assertTrue(escolas.size() == 182);
	}
}
