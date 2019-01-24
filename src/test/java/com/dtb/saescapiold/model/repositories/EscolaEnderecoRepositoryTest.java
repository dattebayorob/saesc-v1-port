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

import com.dtb.saescapiold.model.entities.EscolaEndereco;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EscolaEnderecoRepositoryTest {
	@Autowired
	private EscolaEnderecoRepository enderecoRepository;
	private static final Log log = LogFactory.getLog(EscolaRepositoryTest.class);

	@Before
	public void init() {
		log.info("Iniciando testes para EscolaEnderecoRepository");
	}
	
	@Test
	public void testFindAll() {
		List<EscolaEndereco> enderecos = enderecoRepository.findAll();
		assertFalse(enderecos.isEmpty());
		assertTrue(enderecos.size() == 182);
	}

}
