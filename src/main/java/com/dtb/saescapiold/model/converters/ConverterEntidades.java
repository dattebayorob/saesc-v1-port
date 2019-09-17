package com.dtb.saescapiold.model.converters;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.dtb.saescapiold.model.entities.Escola;
import com.dtb.saescapiold.model.entities.EscolaEndereco;
import com.dtb.saescapiold.model.entities.EscolaIp;
import com.dtb.saescapiold.model.entities.EscolaPrefixo;
import com.dtb.saescapiold.model.entities.EscolaV2;
import com.dtb.saescapiold.model.entities.Link;

@Component
public class ConverterEntidades {
	
	public EscolaV2 toV2(Escola escola) {
		EscolaEndereco endereco = escola.getEndereco();
		return EscolaV2
				.builder()
					.nome(escola.getNome())
					.prefixo(Optional.ofNullable(escola.getPrefixo()).filter(Objects::nonNull).map(EscolaPrefixo::getNome).orElseGet(() -> null))
					.inep(escola.getInep())
					.rua(endereco.getRua())
					.bairro(endereco.getBairro())
					.telefone(endereco.getTelefone())
					.crede("SEFOR_"+endereco.getRegiao())
					.build();
	}
	
	public List<Link> converterLinks(Long escolaV2Id,EscolaIp ips){
		return Stream
				.of(ips.getOi(), ips.getGiga())
				.filter(StringUtils::hasText)
				.map(ip -> {
					String circuito = null;
					Long provedor = 2l;
					if( !ip.startsWith("172") ) {
						circuito = ips.getEscola().getCircuito();
						provedor = 1l;
					};
					return new Link(ip, circuito, provedor, new EscolaV2(escolaV2Id));
					}
				).collect(toList());
	}

}
