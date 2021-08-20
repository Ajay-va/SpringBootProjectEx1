package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Sales;
import com.example.demo.repo.SalesRepository;
import com.example.demo.service.ISalesService;
@Service
public class SalesServiceImpl  implements ISalesService{

	@Autowired
	private SalesRepository repo;
	@Override
	public Integer saveSales(Sales s) {
	   return repo.save(s).getSid();
	}

	@Override
	public void deleteSales(Integer id) {
		repo.deleteById(id);
		
				
	}

	@Override
	public List<Sales> getAllSales() {
		
		List<Sales> list=repo.findAll();
		
		
		
		return list;
	}

	@Override
	public Sales updateSale(Integer id) {
	
		Sales s=repo.findById(id).get();
		
		return s;
	}

}
