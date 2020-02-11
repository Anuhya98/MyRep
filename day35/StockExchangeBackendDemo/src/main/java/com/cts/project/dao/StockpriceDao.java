package com.cts.project.dao;

import java.util.List;

import com.cts.project.model.Stockprice;

public interface StockpriceDao 
{
	public boolean updateStockprice(Stockprice stockprice);
	public boolean addStockprice(Stockprice stockprice);
	public boolean deleteStockprice(Stockprice stockprice);
	public Stockprice getStockPriceById(int id);
	public List<Stockprice> getAllStockPrices();

}
