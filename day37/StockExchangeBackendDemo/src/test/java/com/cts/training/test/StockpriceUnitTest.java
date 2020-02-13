package com.cts.training.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.project.dao.StockpriceDao;

import com.cts.project.model.Stockprice;


public class StockpriceUnitTest
{
	private static AnnotationConfigApplicationContext context;
	private static StockpriceDao stockpriceDAO;
	private static Stockprice stockprice;

	@BeforeClass
	public static void init() 
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.project");
		context.refresh();
		stockprice=(Stockprice)context.getBean("stockprice");
		stockpriceDAO=(StockpriceDao) context.getBean("stockpriceDAO");
	  	
	}
	@Test
	@Ignore
	public void testGetAllStockExchangeprices() {
	List<Stockprice> stockprices=stockpriceDAO.getAllStockPrices();
	assertEquals(1, stockprices.size());
	}
    @Test
    @Ignore
	public void testUpdateStockPriceSuccess() {
		Stockprice s=stockpriceDAO.getStockPriceById(1);
		s.setTime(LocalTime.now());
		assertEquals(true, stockpriceDAO.updateStockprice(s));
	}
	@Test
	public void testaddStockPrice() {
		Stockprice s=new Stockprice(101, "bse", 6000, LocalDate.now(), LocalTime.now());
		assertEquals(true, stockpriceDAO.addStockprice(s));
	}
}
