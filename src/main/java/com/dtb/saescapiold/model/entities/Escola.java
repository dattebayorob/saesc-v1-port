package com.dtb.saescapiold.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "escola")
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
	@Column(name = "email_escola")
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInep() {
		return inep;
	}
	public void setInep(String inep) {
		this.inep = inep;
	}
	public String getCircuito() {
		return circuito;
	}
	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EscolaPrefixo getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(EscolaPrefixo prefixo) {
		this.prefixo = prefixo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Escola [id=" + id + ", inep=" + inep + ", circuito=" + circuito + ", nome=" + nome + ", prefixo="
				+ prefixo + ", email=" + email + "]";
	}
	
	
	
}
