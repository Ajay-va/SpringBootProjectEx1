package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Sales;
import com.example.demo.service.impl.SalesServiceImpl;

@Controller
@RequestMapping("/sales")
public class SalesController {

	
	@Autowired 
	private SalesServiceImpl service;
	@GetMapping("/register")
	public String showRegister() {
		return "Regi";
	}
	@PostMapping("/save")
	public String saveData(@ModelAttribute Sales s,Model map) {
		Integer id=service.saveSales(s);
		map.addAttribute("hello","saved"+id );
		return "Regi";
	}
	@GetMapping("/all")
	public String getAllData(Model map) {
		List<Sales> list=service.getAllSales();
		map.addAttribute("hello",list);
		return "Data";
	}
	@GetMapping("/delete/{cid}")
	public String deleteOneRow(@PathVariable Integer cid,Model model) {
		service.deleteSales(cid);
		List<Sales> list=service.getAllSales();
		model.addAttribute("hello",list);	
		return "Data";
	}
	@GetMapping("/update/{cid}")
	public String updateRow(@PathVariable Integer cid,Model model) {
		Sales c=service.updateSale(cid);
		model.addAttribute("hello", c);
		return "SaleEdit";
	}
}