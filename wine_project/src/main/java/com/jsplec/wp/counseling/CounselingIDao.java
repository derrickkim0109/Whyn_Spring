package com.jsplec.wp.counseling;

import java.util.ArrayList;

public interface CounselingIDao {
	

	public ArrayList<ContentDto> listDao();
	public void writeDao(String mWriter, String mContent , String mAddr, String mEmail, String mRelation);
	public void deleteDao(String string); // 들어가는 변수명 달라도 됨ㅋㅋㅋ 스트링 인트 암상관없긔 ㅎㅋ 지멋대로임ㅋ
	public ContentDto updateviewDao(String mId);
	public void updateDao(String mWriter, String mContent , String mAddr, String mEmail, String mRelation ,String mId);
	
	
	
	

}
