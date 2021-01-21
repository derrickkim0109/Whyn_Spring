package com.jsplec.wp.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.wp.command.ACommand;

public class LogoutCommand implements ACommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		// TODO Auto-generated method stub
		session.invalidate();
	}

}
