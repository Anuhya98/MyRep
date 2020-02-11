package com.cts.training.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.project.dao.CompanyDao;
import com.cts.project.model.Company;
import com.cts.project.model.User;


public class CompanyUnitTest 
{
	private static AnnotationConfigApplicationContext context;
	private static CompanyDao companyDAO;
	private static Company company;
	
	@BeforeClass
	public static void init() 
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.project");
		context.refresh();
		company=(Company)context.getBean("company");
		companyDAO=(CompanyDao) context.getBean("CompanyDAO");
	  	
	}
	@Test
	public void testGetAllCompanies() {
		List<Company> companies=companyDAO.getAllCompanyies();
		assertEquals(2, companies.size());
	}
	@Test
	@Ignore
	public void test_update_company_success()
	{
		Company c=companyDAO.getCompanyById(10);
		c.setCompanyName("ABC technologies");
		assertEquals( true, companyDAO.updateCompany(c));
	}
	@Test
	@Ignore
	public void test_add_company_success() {
		Company c=new Company(111, "Patanjali", "Baba Ramdev"," Mr.X", 1000, "Shesht Ayurveda", LocalDate.now());
		assertEquals(true,companyDAO.addCompany(c));
	}
	@Test
	@Ignore
	public void test_delete_company_success() 
	{
		Company c=companyDAO.getCompanyById(34);
		assertEquals(true, companyDAO.deleteCompany(c));	
	}
	
	@Test(expected=NullPointerException.class)
	public void test_delete_user_by_id_fail()
	{
		Company c=companyDAO.getCompanyById(100);
		assertEquals(true, c.getBriefDescription());
	}
	
	@Test(expected=NullPointerException.class)
	public void test_get_company_by_id_fail()
	{
		Company c=companyDAO.getCompanyById(50);
		assertEquals("Anand",c.getBoardMember());
	}
	
	@Test(expected=NullPointerException.class)
	public void test_update_company_by_id_fail()
	{
		Company c=companyDAO.getCompanyById(90);
		c.setCeoName("Anil Ambani");
		assertEquals( true, companyDAO.updateCompany(c));
	}

	
}
