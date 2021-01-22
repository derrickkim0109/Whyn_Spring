package com.jsplec.wp.mypage;

import java.util.ArrayList;

public interface mainMyPageIDao {

	// 유저정보
	public MyPageDto myPageUserinfoView(String userno); 
	// 내가쓴 후기글 정보
	public ArrayList<MyPageDto> myPageReviewView(String userid);
	// 내 구독 정보
	public MyPageDto myPageSubscribeView(String userno);
	// 배송지 보여주기 
	public MyPageDto deliveryUserinfoView(String duserid);
	// 배송지 바꾸는것 
	public void deliveryUpdate(String duserid, String dusername,String dtel, String daddress1,String daddress2, String daddress3, String dmsg);

}
