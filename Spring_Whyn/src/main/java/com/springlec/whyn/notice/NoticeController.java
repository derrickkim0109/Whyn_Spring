package com.springlec.whyn.notice;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
	

	
	
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@RequestMapping("notice")
	public String notice(Model model) {
		NoticeIDao dao = sqlSession.getMapper(NoticeIDao.class);
		model.addAttribute("notice",dao.noticeManagementList());
		return "views/noticeManagement";
		
	}
	

}
