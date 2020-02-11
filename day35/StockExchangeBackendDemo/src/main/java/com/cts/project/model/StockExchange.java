package com.cts.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Stock-exchange")
public class StockExchange
{
	@Id
	@GeneratedValue
	private int stockId;
	private String stockexchangename;
	private String brief;
	private String contactAddress;
	private String remarks;
	public StockExchange() {
		
	}
	public StockExchange(int stockId, String stockexchangename, String brief, String contactAddress, String remarks) {
		super();
		this.stockId = stockId;
		this.stockexchangename = stockexchangename;
		this.brief = brief;
		this.contactAddress = contactAddress;
		this.remarks = remarks;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStockexchangename() {
		return stockexchangename;
	}
	public void setStockexchangename(String stockexchangename) {
		this.stockexchangename = stockexchangename;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "StockExchange [stockId=" + stockId + ", stockexchangename=" + stockexchangename + ", brief=" + brief
				+ ", contactAddress=" + contactAddress + ", remarks=" + remarks + "]";
	}
	
	

}
