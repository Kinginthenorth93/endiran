package com.project.newspaperservice;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.dto.NewspaperDTO;
import com.project.newspaperdao.NewspaperDAO;
import com.project.newspaperentity.Newspaper;

@Component
public class NewspaperServiceImpl implements NewspaperService {
	@Autowired
	private NewspaperDAO newspaperdao;
	
	public NewspaperServiceImpl() {
		System.out.println("Newspaper service impl is created");
	}

	@Override
	public boolean validateNewspaperDTO(NewspaperDTO newspaperdto) {
		System.out.println("Invoked validate newspaperdto method......");
		boolean flag=false;
		if(newspaperdto.getNewspaperName()!=null &!newspaperdto.getNewspaperName().isEmpty()) {
			flag=true;
		}else {
			flag=false;
			System.out.println("Newspaper name is invalid");
			return flag;
		}
		if(newspaperdto.getPrice()>0) {
			flag=true;
		}else {
			flag=false;
			System.out.println("Newspaper price is invalid");
			return flag;
		}
		if(newspaperdto.getLanguage()!=null &!newspaperdto.getLanguage().isEmpty()) {
			flag=true;
		}else {
			flag=false;
			System.out.println("Newspaper Language is invalid");
			return flag;
		}
		if(newspaperdto.getNoofpages()>0) {
			flag=true;
		}else {
			flag=false;
			System.out.println("Newspaper pages are invalid");
			return flag;
		}
		return false;
		
	}

	@Override
	public boolean saveNewspaperDTO(NewspaperDTO newspaperdto) {
		System.out.println("Invoked save NewspaperDTO method......");
		Newspaper newspaper=new Newspaper();
		BeanUtils.copyProperties(newspaperdto, newspaper);
		boolean result=this.newspaperdao.savenewspaperentity(newspaper); 
				
		return result;
	}

}
