package com.dtb.saescapiold.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "escola_ip")
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Escola getEscola() {
		return escola;
	}
	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	public String getOi() {
		return oi;
	}
	public void setOi(String oi) {
		this.oi = oi;
	}
	public String getGiga() {
		return giga;
	}
	public void setGiga(String giga) {
		this.giga = giga;
	}
	public Long getStatusOi() {
		return statusOi;
	}
	public void setStatusOi(Long statusOi) {
		this.statusOi = statusOi;
	}
	public Long getStatusGigafor() {
		return statusGigafor;
	}
	public void setStatusGigafor(Long statusGigafor) {
		this.statusGigafor = statusGigafor;
	}
	@Override
	public String toString() {
		return "EscolaIp [id=" + id + ", escola=" + escola + ", oi=" + oi + ", giga=" + giga + ", statusOi=" + statusOi
				+ ", statusGigafor=" + statusGigafor + "]";
	}
	
	
	
}
