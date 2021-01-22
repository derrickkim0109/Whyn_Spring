package com.springlec.whyn.winelist;

import java.util.ArrayList;

public interface WineListIDao {
	
		// 셀렉트만
		public ArrayList<WineListDto> listDao(); 
		// 인설트
//		public void writeDao(String uName, String uTelno, String uAddress, String uEmail, String uRelation);
		// 업데이트
		public void modifyDao(int pno, String pname, int pcount, String pcountry, String pcolor, String ptext, int pcontent);
		// 원하는 번호의 정보 셀렉트
		public WineListDto contentDao(int pno);
		// 삭제
//		public void deleteDao(int uno);
		
	}


