package com.jsplec.wp.mypage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.wp.mypage.dto.MyPageDto;

public in MyPageIDao {
	DataSource dataSource;
	
	
	

	
		"";
	
	
	 "";
		
	
	
		
	"select ssubno,speriod,sbottle,senddate,suserno,startdate,enddate, sprice from subscribe where suserno = ?";
	
	
	
	
	
	
"select dtel, daddress1, daddress2,daddress3, dusername, dmsg from delivery where duserid = ?";
	
	
	
			 "update delivery set dusername=?,dtel=?  , daddress1=?,daddress2=?,daddress3= ?, dmsg = ?   where duserid=?";
	
	
	
	
	
	
	
	
	
	
	
}//-------------------------end---------------------------------
