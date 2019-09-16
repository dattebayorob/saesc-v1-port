package com.dtb.saescapiold.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "escola_ip")
@Data
public class EscolaIp {
	@Id
	@Column(name = "cod_ip")
	private Long id;
	@OneToOne
	@JoinColumn(name = "cod_escola", nullable = false)
	private Escola escola;
	@Column(name = "ip_oi")
	private String oi;
	@Column(name = "ip_gigafor")
	private String giga;
	@Column(name = "status_oi")
	private Long statusOi;
	@Column(name = "status_gigafor")
	private Long statusGigafor;
	public EscolaIp() {
		// TODO Auto-generated constructor stub
	}
	public EscolaIp(Escola escola, String oi, String giga) {
		this.escola = escola;
		this.oi = oi;
		this.giga = giga;
	}
	
}
