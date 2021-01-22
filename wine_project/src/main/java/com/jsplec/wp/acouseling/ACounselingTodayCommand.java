package com.jsplec.wp.acouseling;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.wp.acount.ACLDto;
import com.jsplec.wp.command.ACommand;
import com.jsplec.wp.dao.AcountDao;

public class ACounselingTodayCommand implements ACommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		// TODO Auto-generated method stub
		
		AcountDao dao = new AcountDao();
		
		ArrayList<ACLDto> dtos = new ArrayList<ACLDto>();
		
		
		dtos = dao.counselingTodayList();
		
		request.setAttribute("counselingTodayList",dtos);
		
		
		System.out.println(dtos);
	}

}
