package com.dtb.saescapiold.service;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dtb.saescapiold.model.entities.Escola;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EscolaServiceTest {
	@Autowired
	private EscolaService escolaService;
	
	@Before
	public void init() {
		
	}
	
	@Test
	public void testBuscarTodas() {
		List<Escola> escolas = escolaService.buscarTodas();
		escolas.forEach(e -> System.out.println(e.toString()));
		assertFalse(escolas.isEmpty());
	}
}
