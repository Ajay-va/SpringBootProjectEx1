package com.example.demo.service;

import java.util.List;

import com.example.demo.model.FilpKart;

public interface IFilpKartService {

	public Integer saveFilpKart(FilpKart f);
	public List<FilpKart> getAllFilpKart();
	public void deleteFilpKart(Integer id);
	public FilpKart updateFilpKart(Integer id);
}
