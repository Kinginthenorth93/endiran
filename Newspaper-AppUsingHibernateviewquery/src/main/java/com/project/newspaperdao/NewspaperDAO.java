package com.project.newspaperdao;

import java.util.List;

import com.project.newspaperentity.Newspaper;

public interface NewspaperDAO {
	public boolean savenewspaperentity(Newspaper newspaper);
	public Newspaper getNewspaperEntity(String NewspaperName);
	public List<Newspaper> getAllNewspaperEntity();
	

}
