package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Invoice;
import com.example.demo.service.impl.InvoiceServiceImpl;
@Controller
@RequestMapping("/invoice")
public class InvoiceController {
	
	@Autowired
	private InvoiceServiceImpl service;
	//it show register page
	@RequestMapping("/register")
	public String showRegisterPage() {	
		return  "InvoiceRegister";
	}
        //it show save the data
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveDataInDatabase(@ModelAttribute Invoice invoice,Model model) {
		
		service.saveData(invoice);
		//model.addAttribute("list", list);
		
		return "InvoiceRegister";

	}
	@RequestMapping("/all")
	public String showAllData(Model model) {
		
		List<Invoice> in=service.getAllData();
		model.addAttribute("list", in);	
		return "InvoiceDate";
	}
	@RequestMapping("/delete/{id}")
	public String deleteOneRow(@PathVariable Integer id,Model model) {
		service.deleteInvoice(id);
		List<Invoice> li=service.getAllData();
		model.addAttribute("list",li);
		return "InvoiceDate";
	}
	@RequestMapping("/update/{id}")
	public String updateRow(@PathVariable Integer id,Model model) {
		Invoice in=service.updateInvoice(id);
		model.addAttribute("list",in);		
		return "InvoiceEdit";
	}
}