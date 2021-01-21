package com.jsplec.wp.comment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.wp.command.ACommand;
import com.jsplec.wp.dao.CommentDao;

public class CommentDeleteCommand implements ACommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		int seq = Integer.parseInt(request.getParameter("seq"));
		
		CommentDao dao = new CommentDao();
		
		dao.CommentDelete(seq);
		

	}

}
