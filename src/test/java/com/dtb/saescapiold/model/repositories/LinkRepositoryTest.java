package com.dtb.saescapiold.model.repositories;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dtb.saescapiold.model.entities.Escola;
import com.dtb.saescapiold.model.entities.Link;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LinkRepositoryTest {
	@Autowired
	private LinkRepository repository;
	private Link link;
	
	@Before
	public void init() {
		//Escola com id um já adicionada
		link = new Link("ip", "circuito", Long.valueOf(1), new Escola() {{setId(Long.valueOf(1));}});
		repository.save(link);
	}
	@After
	public void finish() {
		repository.deleteAll();
	}
	@Test
	public void testSave() {
		assertNotNull(link.getId());
	}
	@Test
	public void testFindAll() {
		assertFalse(repository.findAll().isEmpty());
	}
}
