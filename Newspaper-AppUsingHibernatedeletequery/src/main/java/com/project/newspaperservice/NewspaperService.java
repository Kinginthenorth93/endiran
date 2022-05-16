package com.project.newspaperservice;

import java.util.List;

import com.project.dto.NewspaperDTO;

public interface NewspaperService {
	public boolean validateNewspaperDTO(NewspaperDTO newspaperdto);
	public boolean saveNewspaperDTO(NewspaperDTO newspaperdto);
	public NewspaperDTO getNewspaperName(String NewspaperName);
	public boolean validateNewspaperName(String NewspaperName);
	public List<Object> getAllNewspaperEntity();
	boolean deleteNewspaperEntity(String NewspaperName);

}
