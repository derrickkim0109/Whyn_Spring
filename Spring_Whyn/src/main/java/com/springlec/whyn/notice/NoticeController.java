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
	
	
	
	

}
