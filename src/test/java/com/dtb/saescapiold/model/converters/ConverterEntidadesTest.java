package com.dtb.saescapiold.model.converters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dtb.saescapiold.model.entities.Escola;
import com.dtb.saescapiold.model.entities.EscolaEndereco;
import com.dtb.saescapiold.model.entities.EscolaIp;
import com.dtb.saescapiold.model.entities.EscolaPrefixo;
import com.dtb.saescapiold.model.entities.EscolaV2;
import com.dtb.saescapiold.model.entities.Link;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConverterEntidadesTest {
	private static final Log log = LogFactory.getLog(ConverterEntidades.class);
	private ConverterEntidades converter;
	private Escola escola;
	private EscolaIp ips;
	
	@Before
	public void init() {
		converter = new ConverterEntidades();
		escola = new Escola();
		escola.setNome("Escola de Testes");
		escola.setEndereco(new EscolaEndereco("Rua","Bairro","1","31000000"));
		escola.setPrefixo(new EscolaPrefixo("EEFM"));
		escola.setCircuito("circuito");
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
		List<Link> links = converter.converterLinks(Long.valueOf(1),ips);
		assertFalse(links.isEmpty());
		assertEquals(links.size(), 2);
	}
}
