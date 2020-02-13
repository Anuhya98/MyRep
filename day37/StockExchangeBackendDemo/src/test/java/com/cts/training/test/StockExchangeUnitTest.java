package com.cts.training.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.project.dao.IpoDao;
import com.cts.project.dao.StockExchangeDao;
import com.cts.project.model.Ipo;
import com.cts.project.model.StockExchange;

public class StockExchangeUnitTest 
{
	private static AnnotationConfigApplicationContext context;
	private static StockExchangeDao stockExchangeDAO;
	private static StockExchange stockExchange;
	
	@BeforeClass
	public static void init() 
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.project");
		context.refresh();
	    stockExchange=(StockExchange)context.getBean("stockExchange");
		stockExchangeDAO=(StockExchangeDao) context.getBean("StockExchangeDAO");
	}
	@Test
	@Ignore
	public void testGetAllStockExchanges() {
		List<StockExchange> stockexchanges=stockExchangeDAO.getAllStockExchanges();
		assertEquals(2, stockexchanges.size());
	}
	@Test
	
	public void test_add_stockexchange_success() {
		StockExchange s=new StockExchange(223, "nse", "Very responsive", "New Delhi", "Not upto the mark");
		assertEquals(true,stockExchangeDAO.addStockExchange(s));
	}


}
