package com.cts.training.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.project.dao.CompanyDao;
import com.cts.project.dao.IpoDao;
import com.cts.project.model.Company;
import com.cts.project.model.Ipo;

public class IpoUnitTest 
{
	private static AnnotationConfigApplicationContext context;
	private static IpoDao ipoDAO;
	private static Ipo ipo;
	@BeforeClass
	public static void init() 
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.project");
		context.refresh();
	     ipo=(Ipo)context.getBean("ipo");
		ipoDAO=(IpoDao) context.getBean("ipoDAO");
	  	
	}
	
	@Test
	public void testGetAllIpos() {
		List<Ipo> ipos=ipoDAO.getAllIpos();
		assertEquals(2, ipos.size());
	}
	
	@Test
	@Ignore
	public void test_add_company_success() {
		Ipo i=new Ipo(121,"Patanjali","bse",6600,35,LocalDateTime.now(),"ok");
		assertEquals(true,ipoDAO.addIpo(i));
	}

}
