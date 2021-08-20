package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Sales;

public interface ISalesService {

	public Integer saveSales(Sales s);
	public void deleteSales(Integer id);
	public List<Sales> getAllSales();
	public Sales updateSale(Integer id);
	
}
