package com.cts.project.dao;

import java.util.List;

import com.cts.project.model.StockExchange;

public interface StockexchangeDao
{
	public boolean addStockexchange(StockExchange stockexchange);
	public boolean updateStockexchange(StockExchange stockexchange);
	public boolean deleteStockexchange(StockExchange stockexchange);
	public StockExchange getStockexchangeById(int id);
	public List<StockExchange> getAllStockexchanges();

}
