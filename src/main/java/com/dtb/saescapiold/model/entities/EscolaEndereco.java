package com.dtb.saescapiold.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "escola_endereco")
@Data
public class EscolaEndereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_endereco")
	private Long id;
	@Column(name = "rua_escola")
	private String rua;
	@Column(name = "bairro_escola")
	private String bairro;
	@Column(name = "regiao_escola")
	private String regiao;
	@Column(name = "telefone_escola")
	private String telefone;
	@Column(name = "telefone2_escola")
	private String telefone2;
	public EscolaEndereco() {}
	public EscolaEndereco(String rua,String bairro,String regiao,String telefone) {
		this.rua = rua;
		this.bairro = bairro;
		this.regiao = regiao;
		this.telefone = telefone;
	}
}
