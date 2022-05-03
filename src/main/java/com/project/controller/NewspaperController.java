package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.dto.NewspaperDTO;
import com.project.newspaperservice.NewspaperServiceImpl;
@Controller
@RequestMapping("/")
public class NewspaperController {
	@Autowired
	private NewspaperServiceImpl serviceimpl;
	
	public NewspaperController() {
		System.out.println("Object is created");
	}
		
	
	@RequestMapping("/news.abc")
	public String SaveNewspaper(@ModelAttribute NewspaperDTO newspaperdto, Model model) {
		System.out.println("Invoked save newspaper method.......");
		if(this.serviceimpl.validateNewspaperDTO(newspaperdto)) {
			boolean isSaved=this.serviceimpl.saveNewspaperDTO(newspaperdto);
			if(isSaved) {
				model.addAttribute("Name", newspaperdto.getNewspaperName());
				model.addAttribute("Price", newspaperdto.getPrice());
				model.addAttribute("Langauge", newspaperdto.getLanguage());
				model.addAttribute("No_of_pages", newspaperdto.getNoofpages());
				System.out.println("Newspaper service data is successfully stored");
				model.addAttribute("ValiationMessage", "Data is saved successfully");
			}
			else {
				model.addAttribute("ValidationMessage", "Invalid data......please check it.... ");
			}
		}
		return "WEB-INF/pages/NewspaperDetails.jsp";
		
	
	}
	

}
