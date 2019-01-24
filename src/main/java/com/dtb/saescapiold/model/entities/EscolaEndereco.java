package com.dtb.saescapiold.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "escola_endereco")
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	@Override
	public String toString() {
		return "EscolaEndereco [id=" + id + ", rua=" + rua + ", bairro=" + bairro + ", regiao="
				+ regiao + ", telefone=" + telefone + ", telefone2=" + telefone2 + "]";
	}
	
	
}
