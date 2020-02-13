package com.cts.project.dao;

import java.util.List;

import com.cts.project.model.Company;
import com.cts.project.model.StockExchange;

public interface CompanyDao 
{
	//public boolean addCompany(Company company);
	//public boolean updateCompany(Company company);
	public boolean saveOrUpdateCompany(Company company);
	public boolean deleteCompany(Company company);
	public Company getCompanyById(int id);
	public List<Company> getAllCompanyies();


}
