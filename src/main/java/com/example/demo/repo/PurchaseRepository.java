package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase,Integer>{

}
