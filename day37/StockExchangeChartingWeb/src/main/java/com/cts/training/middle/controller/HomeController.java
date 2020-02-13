package com.cts.training.middle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.project.dao.CompanyDao;
import com.cts.project.dao.IpoDao;
import com.cts.project.dao.UserDao;
import com.cts.project.model.Company;
import com.cts.project.model.User;

@Controller
public class HomeController
{
	@Autowired
	private UserDao userDAO;
	@Autowired
	private CompanyDao companyDAO;
	@Autowired
	private IpoDao ipoDAO;
	
	
//	@GetMapping("/")
	@RequestMapping("/")
   public String indexPage(Model model) {
		model.addAttribute("message", "Welcome to Spring MVC");
		//List<String> names=new ArrayList<String>();
		
		//addNames(names);
		//model.addAttribute("list", names);
	   return "index";
   }
	
	@RequestMapping("/company")
	public String companyPage(Model model) {
		
		return "companies";
	}
	
	@RequestMapping("/ipo")
	public String ipoPage(Model model) {
		return "ipos";
	}
	
	@RequestMapping("/stockExchange")
	public String stockExchangePage(Model model) {
		return "stockexchanges";
	}
	
	
	/*
	 * public String usersPage(Model model) { //model.addAttribute("list", ); }
	 */

private void addNames(List<String> names) {
	names.add("Anu");
	names.add("Siddharth");
	names.add("Abdus");
	names.add("Rohit");
	
}

}
