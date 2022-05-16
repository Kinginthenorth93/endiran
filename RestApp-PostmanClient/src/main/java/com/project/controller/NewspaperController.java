package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Newspaper;
import com.example.service.NewspaperService;

@RestController
public class NewspaperController {
	@Autowired
	private NewspaperService service;
	
	@RequestMapping("/newspaper")
	public List<Newspaper> getNewspaperEntity() {
		return service.getNewspaperEntity();
	}

}
