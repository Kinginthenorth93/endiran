package com.project.newspaperservice;

import java.util.ArrayList;
import java.util.List;

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
		return flag;
		
	}

	@Override
	public boolean saveNewspaperDTO(NewspaperDTO newspaperdto) {
		System.out.println("Invoked save NewspaperDTO method......");
		Newspaper newspaper=new Newspaper();
		BeanUtils.copyProperties(newspaperdto, newspaper);
		boolean result=this.newspaperdao.savenewspaperentity(newspaper); 
				
		return result;
	}
	
	@Override
	public boolean validateNewspaperName(String NewspaperName) {
		System.out.println("invoked validate newspaper name method.......");
		boolean flag=false;
		if(NewspaperName!=null && !NewspaperName.isEmpty()) {
			flag=true;
			return flag;			
		}else {
			flag=false;
			System.out.println("Newspaper name is valid");
			return flag;
		}
	}


	@Override
	public NewspaperDTO getNewspaperName(String NewspaperName) {
		System.out.println("Invoked get Newspaper name method.....");
		Newspaper entity=this.newspaperdao.getNewspaperEntity(NewspaperName);
		if(entity!=null) {
			NewspaperDTO dto=new NewspaperDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;
	}

	@Override
	public List<Object> getAllNewspaperEntity() {
		System.out.println("Invoked get all Newspaper entity method...");
		List<Object> NewspaperContainer=null;
		List<Newspaper> NewspaperEntityContainer=this.newspaperdao.getAllNewspaperEntity();
		if(NewspaperEntityContainer!=null) {
			return NewspaperContainer=new ArrayList<Object>(NewspaperEntityContainer);
			}
		return NewspaperContainer;
	}

	@Override
	public boolean deleteNewspaperEntity(String NewspaperName) {
		System.out.println("delete Newspaper method is created........");
		boolean Newspaper=this.newspaperdao.deleteNewspaperEntity(NewspaperName);
		
		return Newspaper;
	}

	
}
