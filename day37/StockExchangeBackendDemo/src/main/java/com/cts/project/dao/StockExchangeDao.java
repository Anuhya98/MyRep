package com.cts.project.dao;

import java.util.List;

import com.cts.project.model.StockExchange;

public interface StockExchangeDao
{
	public boolean addStockExchange(StockExchange stockExchange);
	public boolean updateStockExchange(StockExchange stockExchange);
	public boolean deleteStockExchange(StockExchange stockExchange);
	public StockExchange getStockExchangeById(int stockId);
	public List<StockExchange> getAllStockExchanges();

}
