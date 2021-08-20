package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Purchase;
import com.example.demo.service.IPurchaseService;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {

	@Autowired
	private IPurchaseService service;
	@GetMapping("/regi")
	public String showPage() {
		return "PurchaseRegister";
	}
	@PostMapping("/save")
	public String saveDataToDatabase(@ModelAttribute Purchase p,ModelMap map) {
		Integer id=service.savePurchase(p);
		String s="saved"+id+"successfully";;
		map.addAttribute("str", s);
		return "PurchaseRegister";
	}
	@GetMapping("/all")
	public String getAllData(ModelMap map) {
		
	List<Purchase> list=service.getAllPurchases();
		map.addAttribute("list",list);
		
		return "PurchaseDate";
	}
	@GetMapping("/delete/{id}")
	public String deleteData(@PathVariable Integer id,ModelMap map) {
		service.deletePurchase(id);
		List<Purchase> list=service.getAllPurchases();
		map.addAttribute("list",list);
		return "PurchaseDate";
	}

	@GetMapping("/update/{id}")
	public String updateData(@PathVariable Integer id,ModelMap map) {
		Purchase p=service.updatePurchase(id);
		map.addAttribute("list",p);
		return "PurchaseEdit";	
	}
}