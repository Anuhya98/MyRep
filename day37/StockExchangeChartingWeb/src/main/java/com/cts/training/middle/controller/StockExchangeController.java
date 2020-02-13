package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.project.dao.StockExchangeDao;
import com.cts.project.model.Company;
import com.cts.project.model.StockExchange;

@Controller
public class StockExchangeController 
{
	@Autowired
	StockExchangeDao stockExchangeDAO;
	@GetMapping("/stockExchange-home")
	public String stockExchangePage(Model model)
	{
		model.addAttribute("stockExchange", new StockExchange());
		List<StockExchange> stockexchanges=stockExchangeDAO.getAllStockExchanges();
		model.addAttribute("list", stockexchanges);
		return "stockexchanges";
		
	}
	@PostMapping("/stockExchange/save")
	public String addStockExchange(@ModelAttribute("stockExchange") StockExchange stockExchange)
	{
		stockExchangeDAO.addStockExchange(stockExchange);
		return "redirect:/stockExchange-home";
		
	}
	@GetMapping("/stockExchangeremove/{stockId}")
	public String deleteStockExchange(@PathVariable("stockId")int stockId)
	{
		StockExchange stockExchange=stockExchangeDAO.getStockExchangeById(stockId);
		stockExchangeDAO.deleteStockExchange(stockExchange);
		return "redirect:/stockExchange-home";
		
	}

}
