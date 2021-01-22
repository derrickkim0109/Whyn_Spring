package com.jsplec.wp.acount;

import java.util.ArrayList;

public interface AdminCountDao {

	public ArrayList<ACLDto> counselingManagermentList();
	public ArrayList<ACLDto> counselingSearch(String result1, String result2);
	public void counselingDelete(String cno);
	public ACLDto counselingContentView(String cno);
	public int counselingViewRowCount();//체크
	public void cviewcount(String cno);
	public int cviewSelect(String cno);//체크
	public ArrayList<ACLDto> newCounseling();
	public ACLDto todayContentView(String cno);
	public void counselingAnswer(String canswer,String cno);
	public String answer(String cno);//체크
	
	
}
