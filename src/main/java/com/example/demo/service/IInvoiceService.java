package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Invoice;

public interface IInvoiceService {
	
	public Integer saveData(Invoice in);
	public List<Invoice> getAllData();
	public void deleteInvoice(Integer id);
	public Invoice updateInvoice(Integer id);
	
	

}
