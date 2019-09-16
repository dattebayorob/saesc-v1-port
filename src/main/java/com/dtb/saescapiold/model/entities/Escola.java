package com.dtb.saescapiold.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "escola")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Escola {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_escola")
	private Long id;
	@Column(name = "inep_escola" , nullable = false)
	private String inep;
	@Column(name = "circuito_escola")
	private String circuito;
	@Column(name = "nome_escola", nullable = false)
	private String nome;
	@OneToOne
	@JoinColumn(name = "cod_prefixo")
	private EscolaPrefixo prefixo;
	@OneToOne
	@JoinColumn(name = "cod_endereco")
	private EscolaEndereco endereco;
	@Column(name = "email_escola")
	private String email;
}
