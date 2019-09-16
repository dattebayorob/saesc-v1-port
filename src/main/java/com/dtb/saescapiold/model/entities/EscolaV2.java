package com.dtb.saescapiold.model.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(schema = "V2", name = "escola" )
@Data
@Builder
@AllArgsConstructor
public class EscolaV2{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String prefixo;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false, unique = true)
	private String inep;
	private String crede;
	private String rua;
	private String bairro;
	private String telefone;
	@Column(name = "data_criacao", nullable = false)
	private Date dataCriacao;
	@Column(name = "data_atualizacao", nullable = false)
	private Date dataAtualizacao;
	@OneToMany(mappedBy = "escola", fetch = FetchType.LAZY)
	private List<Link> links;
	
	public EscolaV2() {}

	public EscolaV2(Long id) {
		this.id = id;
	}

	@PreUpdate
	public void preUpdate() {
		this.dataAtualizacao = new Date();
	}

	@PrePersist
	public void prePersist() {
		final Date dataAtual = new Date();
		this.dataCriacao = dataAtual;
		this.dataAtualizacao = dataAtual;
	}
}
