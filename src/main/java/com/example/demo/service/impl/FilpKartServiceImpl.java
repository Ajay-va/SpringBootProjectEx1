package com.example.demo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FilpKart;
import com.example.demo.repo.FilpKartRepository;
import com.example.demo.service.IFilpKartService;
@Service
public class FilpKartServiceImpl implements IFilpKartService {
	@Autowired
	private FilpKartRepository repo;
	@Override
	public Integer saveFilpKart(FilpKart f) {
		FilpKart l=repo.save(f);
		return l.getFid();
	}
	@Override
	public List<FilpKart> getAllFilpKart() {

		return repo.findAll();
	}
	@Override
	public void deleteFilpKart(Integer id) {
		repo.deleteById(id);;
	}
	@Override
	public FilpKart updateFilpKart(Integer id) {	
		return repo.findById(id).get();
	}
}