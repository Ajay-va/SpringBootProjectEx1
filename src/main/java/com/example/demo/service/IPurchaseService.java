package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Purchase;

public interface IPurchaseService {

	
	public Integer savePurchase(Purchase p);
	public List<Purchase> getAllPurchases();
	 public void deletePurchase(Integer id);
	 public Purchase updatePurchase(Integer id);
	
}
