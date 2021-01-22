package com.springlec.whyn.auser;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuserController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/AuserList")
	public String auserList(Model model) {
		
		AuserDao auserDao = sqlSession.getMapper(AuserDao.class);
		model.addAttribute("userList",auserDao.userManagementList());
		
		return "jiseokAuserViews/userManagement";
		
		
		
	}
	
}
