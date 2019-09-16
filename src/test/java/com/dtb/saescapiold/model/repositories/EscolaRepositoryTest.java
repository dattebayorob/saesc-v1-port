package com.dtb.saescapiold.model.repositories;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dtb.saescapiold.model.entities.Escola;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class EscolaRepositoryTest {
	@Autowired
	private EscolaRepository repository;
	
	@Before
	public void init() {
		log.info("Iniciando testes para EscolaRepository");
	}
	
	@Test
	public void testFindAll() {
		List<Escola> escolas = repository.findAll();
		assertFalse(escolas.isEmpty());
	}
}
