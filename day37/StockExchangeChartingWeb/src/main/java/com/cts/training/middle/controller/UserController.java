package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.project.dao.UserDao;
import com.cts.project.model.User;

@Controller
public class UserController
{
	@Autowired
	UserDao userDAO;
	@GetMapping("/user-home")
	public String userPage(Model model)
	{
		List<User> users=userDAO.getAllUsers();
		model.addAttribute("list", users);
		model.addAttribute("user", new User());
		//User user=new User();
		return "users";
	}
	
	@PostMapping("/user/save")
	//@RequestMapping(value="/user/save", method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user)
	{
		userDAO.saveOrUpdateUser(user);
		return "redirect:/user-home";
	}
	@GetMapping("/remove/{id}")//{}->Path Variable
	public String deleteUser(@PathVariable("id")int id)
	{
		User user=userDAO.getUserById(id);
		userDAO.deleteUser(user);
		return "redirect:/user-home";
	}
	
	@GetMapping("/update/{id}")
	public String updateUser(@PathVariable("id") int id,Model model)
	{
		User user=userDAO.getUserById(id);
		model.addAttribute("user", user);
		List<User> users=userDAO.getAllUsers();
		model.addAttribute("list", users);
		return "users";
	}
}


