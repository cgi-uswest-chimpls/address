package com.cgi.uswest.chimpls.address;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Address {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	private BigDecimal id_address;
	private BigDecimal id_grp;
	private String	cd_grp;  //C for case, P for person, F for Foster care (F)
	private String	tx_adress;
	private Timestamp dt_start;
	private Timestamp dt_end;
	public BigDecimal getId_address() {
		return id_address;
	}
	public void setId_address(BigDecimal id_address) {
		this.id_address = id_address;
	}
	public BigDecimal getId_grp() {
		return id_grp;
	}
	public void setId_grp(BigDecimal id_grp) {
		this.id_grp = id_grp;
	}
	public String getCd_grp() {
		return cd_grp;
	}
	public void setCd_grp(String cd_grp) {
		this.cd_grp = cd_grp;
	}
	public String getTx_adress() {
		return tx_adress;
	}
	public void setTx_adress(String tx_adress) {
		this.tx_adress = tx_adress;
	}
	public Timestamp getDt_start() {
		return dt_start;
	}
	public void setDt_start(Timestamp dt_start) {
		this.dt_start = dt_start;
	}
	public Timestamp getDt_end() {
		return dt_end;
	}
	public void setDt_end(Timestamp dt_end) {
		this.dt_end = dt_end;
	}
	
}
