package com.dtb.saescapiold.model.converters;

import java.util.ArrayList;
import java.util.List;

import com.dtb.saescapiold.model.entities.Escola;
import com.dtb.saescapiold.model.entities.EscolaEndereco;
import com.dtb.saescapiold.model.entities.EscolaIp;
import com.dtb.saescapiold.model.entities.EscolaV2;
import com.dtb.saescapiold.model.entities.Link;

public class ConverterEntidades {
	
	public EscolaV2 toV2(Escola escola) {
		EscolaV2 escolaV2 = new EscolaV2();
		escolaV2.setNome(escola.getNome());
		escolaV2.setPrefixo(escola.getPrefixo().getNome());
		escolaV2.setInep(escola.getInep());
		converterEndereco(escola.getEndereco(), escolaV2);
		return escolaV2;
	}

	private void converterEndereco(EscolaEndereco endereco, EscolaV2 escolaV2) {
		escolaV2.setRua(endereco.getRua());
		escolaV2.setBairro(endereco.getBairro());
		escolaV2.setTelefone(endereco.getTelefone());
		escolaV2.setCrede("SEFOR_"+endereco.getRegiao());
	}
	
	public List<Link> converterLinks(Long escolaV2Id,EscolaIp ips){
		return new ArrayList<Link>() {
			{
				add(new Link(ips.getOi(), ips.getEscola().getCircuito(),Long.valueOf(1), new EscolaV2() {{setId(escolaV2Id);}}));
				if(ips.getGiga() != null)
					add(new Link(ips.getGiga(), null,Long.valueOf(2),new EscolaV2() {{setId(escolaV2Id);}}));
			}
		};
	}

}
