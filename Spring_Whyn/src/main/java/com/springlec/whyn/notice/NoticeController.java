package com.springlec.whyn.notice;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.whyn.HomeController;

@Controller
public class NoticeController {
	

	
	
	
	@Autowired
	private SqlSession sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping("/notice")
	public String notice(HttpServletRequest request,Model model) {
		NoticeIDao dao = sqlSession.getMapper(NoticeIDao.class);
		model.addAttribute("notice",dao.noticeManagementList());
		return "notice/noticeManagement";
		
	}
	
	@RequestMapping("/noticeWrite")
	public String noticeWrite() {
		
		return "notice/noticeWrite";
	}
	@RequestMapping("/noticeView")
	public String noticeView(HttpServletRequest request,Model model) {
		NoticeIDao dao = sqlSession.getMapper(NoticeIDao.class);
		model.addAttribute("noticeView",dao.noticeContentView(request.getParameter("nno")));
		return "notice/noticeView";
		
		
	}
	@RequestMapping("noticeUpdate")
	public String noticeUpdate(HttpServletRequest request, Model model) {
		NoticeIDao dao = sqlSession.getMapper(NoticeIDao.class);
		dao.noticeUpdate(request.getParameter("nno"), request.getParameter("ntitle"), request.getParameter("ncontent"));
		return "redirect:/notice";
		
	}
	
	@RequestMapping("noticeDelete")
	public String noticeDelete(HttpServletRequest request,Model model) {
		NoticeIDao dao = sqlSession.getMapper(NoticeIDao.class);
		String[] deleteCheck = request.getParameterValues("deleteCheck");
	      //AUserLDao userdao = new AUserLDao();
	      for(int i=0;i<deleteCheck.length;i++) {
	    	  dao.noticeDelete(deleteCheck[i]);
	    	  
	    	  //System.out.println(deleteCheck[i]);
	      }
		return "redirect:/notice";
	}
	
	
	

}
