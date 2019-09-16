package com.dtb.saescapiold.model.repositories;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dtb.saescapiold.model.entities.EscolaV2;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EscolaV2RepositoryTest {
	@Autowired
	private EscolaV2Repository repository;
	EscolaV2 escola;
	
	@Before
	public void init(){
		escola = EscolaV2.builder()
				.nome("Escola V2")
				.prefixo("EEFM")
				.crede("SEFOR_1")
				.inep("inep")
				.rua("Rua").build();
		repository.save(escola);
	}
	@After
	public void finish() {
		repository.deleteAll();
	}
	@Test
	public void testSave() {
		assertNotNull(escola.getId());
	}
	
	@Test
	public void testFindAll() {
		List<EscolaV2> escolas = repository.findAll();
		assertFalse(escolas.isEmpty());
	}
}
