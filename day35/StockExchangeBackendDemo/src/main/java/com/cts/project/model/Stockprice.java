package com.cts.project.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Component
@Table(name="stockprice")
public class Stockprice implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2286347133270333564L;
	@Id
	@GeneratedValue
	private int companyid;
    private String stockexchange;
    private long currentprice;
    private LocalDate date;
    private LocalTime time;
	
    public Stockprice() {
    	
    }
	public Stockprice(int companyid, String stockexchange, long currentprice, LocalDate date, LocalTime time) {
		super();
		this.companyid = companyid;
		this.stockexchange = stockexchange;
		this.currentprice = currentprice;
		this.date = date;
		this.time = time;
	}
	public int getCompanyid() {
		return companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	
	
	
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	public long getCurrentprice() {
		return currentprice;
	}
	public void setCurrentprice(long currentprice) {
		this.currentprice = currentprice;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Stockprice [companyid=" + companyid + ", stockexchange=" + stockexchange + ", currentprice="
				+ currentprice + ", date=" + date + ", time=" + time + "]";
	}
	
	
    
}
