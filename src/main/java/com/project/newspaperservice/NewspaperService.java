package com.project.newspaperservice;

import com.project.dto.NewspaperDTO;

public interface NewspaperService {
	public boolean validateNewspaperDTO(NewspaperDTO newspaperdto);
	public boolean saveNewspaperDTO(NewspaperDTO newspaperdto);

}
