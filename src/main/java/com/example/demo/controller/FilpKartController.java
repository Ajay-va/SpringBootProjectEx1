package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.FilpKart;
import com.example.demo.service.IFilpKartService;

@Controller
@RequestMapping("/Filpkart")
public class FilpKartController {

	@Autowired
	private IFilpKartService service;

        //it shows registration page 
	@RequestMapping("/register")
	public String saveRegisterPage() {
		return "FilpKartRegister";
	}

        //it shows save all data 
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveData(@ModelAttribute FilpKart filpkart,ModelMap map) {
		Integer id=service.saveFilpKart(filpkart);
		//map.addAttribute("list","saved"+id);
		return "FilpKartRegister";
	}

        //it shows all saved data
	@RequestMapping("/all")
	public String getAllData(ModelMap map) {
	
		List<FilpKart> f=service.getAllFilpKart();
		map.addAttribute("list", f);
		
		return "FilpKartData";
	}
        //it delete the particular row data
	@RequestMapping("/delete/{id}")
	public String deleteData(FilpKart f,@PathVariable Integer id,Model model) {
		service.deleteFilpKart(id);
		List<FilpKart> filp=service.getAllFilpKart();
		model.addAttribute("list",filp);
		return "FilpKartData";
	}
	@RequestMapping("/update/{id}")
	public String updateData(@PathVariable Integer id,Model model) {
		FilpKart s=service.updateFilpKart(id);
		model.addAttribute("list", s);
		return "FilpKartEdit";
	}
}