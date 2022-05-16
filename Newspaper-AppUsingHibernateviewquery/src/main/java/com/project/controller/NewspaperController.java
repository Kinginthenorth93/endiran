package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.dto.NewspaperDTO;
import com.project.newspaperservice.NewspaperServiceImpl;

@Component
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
				model.addAttribute("NewspaperName", newspaperdto.getNewspaperName());
				model.addAttribute("Price", newspaperdto.getPrice());
				model.addAttribute("Language", newspaperdto.getLanguage());
				model.addAttribute("Noofpages", newspaperdto.getNoofpages());
				System.out.println("Newspaper service data is successfully stored");
				model.addAttribute("ValiationMessage", "Data is saved successfully");
			}
			else {
				model.addAttribute("ValidationMessage", "Invalid data......please check it.... ");
			}
		}
		return "/WEB-INF/pages/NewspaperDetails.jsp";
			
	}
	
	@RequestMapping("/searchNewspaper.abc")
	public String getNewspaperName(@RequestParam String searchNewspaper, Model model) {
		System.out.println("Invoked get newpaper nam emethod .......");
		if(serviceimpl.validateNewspaperName(searchNewspaper)) {
			NewspaperDTO newspaperdto=this.serviceimpl.getNewspaperName(searchNewspaper);
			if(newspaperdto!=null) {
				model.addAttribute("Name", newspaperdto.getNewspaperName());
				model.addAttribute("Price", newspaperdto.getPrice());
				model.addAttribute("Language", newspaperdto.getLanguage());
				model.addAttribute("Noofpages", newspaperdto.getNoofpages());
				return "WEB-INF/pages/viewNewspaperDetails.jsp";
			}
			else {
				model.addAttribute("NOTFOUND", "Newspaper is not found");
				return "WEB-INF/pages/viewNewspaperDetails.jsp";				 
			}
		}
		else {
			model.addAttribute("searchValidateMessage" , "In alid Newspapaer name... mention valid newspaper name");
		}
		
		return "/WEB-INF/pages/viewNewspaperDetails.jsp";
	}
	
	@RequestMapping("/getAllNewspaper.abc")
	public String getAllNewspaper(Model model) {
		System.out.println("Invoked get all newspaper method....");
		List<Object> getAllNewspaper=this.serviceimpl.getAllNewspaperEntity();
		model.addAttribute("ListofNewspaper", getAllNewspaper);
		
		return "/WEB-INF/pages/getNewspaperDetails.jsp";
		
		
	}
	

}
