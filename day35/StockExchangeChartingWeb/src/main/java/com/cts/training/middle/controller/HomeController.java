package com.cts.training.middle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.project.dao.UserDao;
import com.cts.project.model.User;

@Controller
public class HomeController
{
	@Autowired
	private UserDao userDAO;
	
//	@GetMapping("/")
	@RequestMapping("/")
   public String indexPage(Model model) {
		model.addAttribute("message", "Welcome to Spring MVC");
		//List<String> names=new ArrayList<String>();
		List<User> users=userDAO.getAllUsers();
		model.addAttribute("list", users);
		//addNames(names);
		//model.addAttribute("list", names);
	   return "index";
   }

private void addNames(List<String> names) {
	names.add("Anu");
	names.add("Siddharth");
	names.add("Abdus");
	names.add("Rohit");
	
}

}
