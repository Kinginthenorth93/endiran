package com.trial.DAO;

import com.trial.candidates.Candidates;

public class CandidatesDAOtester {
	public static void main(String[] args) {
		CandidatesDAOimplementations im=new CandidatesDAOimplementations();
		//Candidates candy=new Candidates(14,"Ranjinikanth","M",1956,"Actor",898545230,"Chennai",600000000);
		
		//im.savedata(candy);
		//im.readalldata(candy);
		
		Candidates candy=new Candidates();
		candy.setId(2);
		im.readsingledata(candy);
		
		
		
		
		//im.savedata();
		//im.readalldata();
		//im.readsingledata();
	}

}
