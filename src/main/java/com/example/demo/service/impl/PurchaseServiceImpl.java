package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Purchase;
import com.example.demo.repo.PurchaseRepository;
import com.example.demo.service.IPurchaseService;

@Service
public class PurchaseServiceImpl implements IPurchaseService{

	
	@Autowired
	private PurchaseRepository repo;
	
	public Integer savePurchase(Purchase p) {
		Integer id=repo.save(p).getPid();
		
		
		return id;
	}

	@Override
	public List<Purchase> getAllPurchases() {
		return repo.findAll();
		
	}

	@Override
	public void deletePurchase(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Purchase updatePurchase(Integer id) {
	return repo.findById(id).get();	
	
	}
	
}
