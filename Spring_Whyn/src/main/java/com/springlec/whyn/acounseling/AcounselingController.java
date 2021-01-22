package com.springlec.whyn.acounseling;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.whyn.HomeController;
import com.springlec.whyn.asimplecounseling.AsimpleCounselingDao;

@Controller
public class AcounselingController {
	
	@Autowired
	private SqlSession sqlSession;//sql 세션 불러오기
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@RequestMapping("/counselingManagementList")
	public String counselingManagementList(HttpServletRequest request, Model model) {
		AcounselingDao acounselingDao = sqlSession.getMapper(AcounselingDao.class);
		AsimpleCounselingDao asimpleCounselingDao = sqlSession.getMapper(AsimpleCounselingDao.class);
		model.addAttribute("counselingManagementList",acounselingDao.counselingManagementList());
		model.addAttribute("simpleConList",asimpleCounselingDao.simpleConList());
		
		return "/counselingManagement";
	}
	
	@RequestMapping("/counselingContentView")
	public String counselingContentView(HttpServletRequest request, Model model) {
		AcounselingDao acounselingDao = sqlSession.getMapper(AcounselingDao.class);
		model.addAttribute("counselingContentView",acounselingDao.counselingContentView(request.getParameter("cno")));
		return "/counselingView";
	}
	
	@RequestMapping("/simpleconView")
	public String simpleConList(HttpServletRequest request, Model model) {
		AsimpleCounselingDao asimpleCounselingDao = sqlSession.getMapper(AsimpleCounselingDao.class);
		model.addAttribute("simpleConList",asimpleCounselingDao.simpleContentView(request.getParameter("scno")));
		return "/simpleconView";
	}
}
	
	
	

