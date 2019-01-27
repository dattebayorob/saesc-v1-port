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

@Entity
@Table(name="escola_link")
public class Link{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="id_provedor")
	private Long provedor;
	private String ip;
	private String circuito;
	private String status;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_escola")
	private EscolaV2 escola;
	public Link() {
		// TODO Auto-generated constructor stub
	}
	public Link(String ip, String circuito, Long provedor, EscolaV2 escola) {
		this.ip = ip;
		this.circuito = circuito;
		this.provedor = provedor;
		this.escola = escola;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProvedor() {
		return provedor;
	}
	public void setProvedor(Long provedor) {
		this.provedor = provedor;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getCircuito() {
		return circuito;
	}
	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public EscolaV2 getEscola() {
		return escola;
	}
	public void setEscola(EscolaV2 escola) {
		this.escola = escola;
	}
	
	
}