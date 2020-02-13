package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.project.dao.CompanyDao;
import com.cts.project.model.Company;
import com.cts.project.model.User;

@Controller
public class CompanyController 
{
	@Autowired
	CompanyDao companyDAO;
	@GetMapping("/company-home")
	public String companyPage(Model model)
	{
		model.addAttribute("company", new Company());
		List<Company> companies=companyDAO.getAllCompanyies();
		model.addAttribute("list", companies);
		//User user=new User();
		return "companiesform";
	}
	@PostMapping("/company/save")
	//@RequestMapping(value="/user/save", method=RequestMethod.POST)
	public String addCompany(@ModelAttribute("company") Company company)
	{
		companyDAO.saveOrUpdateCompany(company);
		return "redirect:/company-home";
	}
	
	@GetMapping("/companyremove/{idNumber}")//{}->Path Variable
	public String deleteCompany(@PathVariable("idNumber")int idNumber)
	{
		Company company=companyDAO.getCompanyById(idNumber);
		companyDAO.deleteCompany(company);
		return "redirect:/company-home";
	}
	

}
