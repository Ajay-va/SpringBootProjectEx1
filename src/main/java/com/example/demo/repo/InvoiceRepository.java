package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {

}