package com.dtb.saescapiold.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(schema="V2", name="escola_link")
@Data
public class Link{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="id_provedor")
	private Long provedor;
	private String ip;
	private String circuito;
	private String status;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_escola")
	private EscolaV2 escola;
	public Link() {}
	public Link(String ip, String circuito, Long provedor, EscolaV2 escola) {
		this.ip = ip;
		this.circuito = circuito;
		this.provedor = provedor;
		this.escola = escola;
	}
}