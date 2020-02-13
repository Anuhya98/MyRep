package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.project.dao.IpoDao;
import com.cts.project.model.Company;
import com.cts.project.model.Ipo;



@Controller
public class IpoController 
{
	@Autowired
	IpoDao ipoDAO;
	@GetMapping("/ipo-home")
	public String ipoPage(Model model)
	{
		model.addAttribute("ipo", new Ipo());
		List<Ipo> ipos=ipoDAO.getAllIpos();
		model.addAttribute("list", ipos);
		//User user=new User();
		return "ipos";
	}
	@PostMapping("/ipo/save")
	//@RequestMapping(value="/user/save", method=RequestMethod.POST)
	public String addIpo(@ModelAttribute("ipo") Ipo ipo)
	{
		ipoDAO.addIpo(ipo);
		return "redirect:/ipo-home";
	}
	
	@GetMapping("/iporemove/{id}")//{}->Path Variable
	public String deleteIpo(@PathVariable("id")int id)
	{
		Ipo ipo=ipoDAO.getIpoById(id);
		ipoDAO.deleteIpo(ipo);
		return "redirect:/ipo-home";
	}

}
