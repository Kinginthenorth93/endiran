package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Newspaper;
import com.example.repository.NewspaperRepository;

@Service
public class NewspaperService {
	@Autowired
	private NewspaperRepository repo;
	
	public List<Newspaper> getNewspaperEntity() {
		List<Newspaper> list=new ArrayList<Newspaper>();
		for(Newspaper newspaper:repo.findAll()) {
			list.add(newspaper);
		}
		return list;
	}

}
