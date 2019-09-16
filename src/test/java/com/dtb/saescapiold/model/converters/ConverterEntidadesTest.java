package com.dtb.saescapiold.model.converters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.dtb.saescapiold.model.entities.Escola;
import com.dtb.saescapiold.model.entities.EscolaEndereco;
import com.dtb.saescapiold.model.entities.EscolaIp;
import com.dtb.saescapiold.model.entities.EscolaPrefixo;
import com.dtb.saescapiold.model.entities.EscolaV2;
import com.dtb.saescapiold.model.entities.Link;

public class ConverterEntidadesTest {
	ConverterEntidades converter = new ConverterEntidades();
	Escola escola;
	EscolaIp ips;
	Long escolaId = 1l;
	
	@Before
	public void init() {
		escola = Escola.builder()
					.nome("Escola de Testes")
					.endereco(new EscolaEndereco("Rua","Bairro","1","31000000"))
					.prefixo(new EscolaPrefixo("EEFM"))
					.circuito("circuito")
				.build();
		ips = new EscolaIp(escola,"200.0.0.200","172.0.0.172");
	}
	
	@Test
	public void testToV2() {
		EscolaV2 v2 = converter.toV2(escola);
		assertTrue(escola.getNome() == v2.getNome());
		assertTrue(escola.getPrefixo().getNome() == v2.getPrefixo());
		assertTrue(escola.getEndereco().getRua() == v2.getRua());
	}
	
	@Test
	public void testConverterLinks() {
		List<Link> links = converter.converterLinks(escolaId,ips);
		assertFalse(links.isEmpty());
		assertEquals(links.size(), 2);
	}
	
	@Test
	public void deveConverterApenasUmLink() {
		ips.setGiga(null);
		List<Link> links = converter.converterLinks(escolaId, ips);
		assertFalse(links.isEmpty());
		assertEquals(links.size(), 1);
	}
}
