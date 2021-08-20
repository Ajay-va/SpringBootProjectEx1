package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Invoice;
import com.example.demo.repo.InvoiceRepository;
import com.example.demo.service.IInvoiceService;

@Service
public class InvoiceServiceImpl implements IInvoiceService {

	@Autowired
	private InvoiceRepository repo;
	
	
	public Integer saveData(Invoice in) {
		Invoice i=repo.save(in);
		return i.getId();	
	}

	

	
	public List<Invoice> getAllData() {
		return repo.findAll();
}

	
	public void deleteInvoice(Integer id) {

		repo.deleteById(id);
	
	
      }



	@Override
	public Invoice updateInvoice(Integer id) {
		return repo.findById(id).get();
	}
}
