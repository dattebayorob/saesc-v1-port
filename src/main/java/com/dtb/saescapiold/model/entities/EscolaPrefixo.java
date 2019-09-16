package com.dtb.saescapiold.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "escola_prefixo")
@Data
public class EscolaPrefixo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_prefixo")
	private Long id;
	@Column(name = "nome_prefixo")
	private String nome;
	public EscolaPrefixo() {}
	
	public EscolaPrefixo(String nome){
		this.nome = nome;
	}
	
}
