package com.springlec.whyn.winelist;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class WineListController {
	
	private static final Logger logger = LoggerFactory.getLogger(WineListController.class);
	
	@Autowired
	private SqlSession sqlSession;
	
		// 리스트 띄우기
		@RequestMapping("/winelist")
		public String winelist(Model model) {
			// 
			WineListIDao dao = sqlSession.getMapper(WineListIDao.class); 
			model.addAttribute("winelist", dao.listDao());
			System.out.println("model  :  " + model);
			return "/winelist";
		}
		
		// 리스트 내용보기
		@RequestMapping("wineContentView")
		public String view(HttpServletRequest request, Model model) {
			WineListIDao dao = sqlSession.getMapper(WineListIDao.class);
			model.addAttribute("wineContent_View", dao.contentDao(Integer.parseInt(request.getParameter("pno"))));
			return "contentView";
		}
		
		// 불러온 내용 수정하기
		@RequestMapping("/modify")
		public String modify(HttpServletRequest request, Model model) {
			WineListIDao dao = sqlSession.getMapper(WineListIDao.class);
			dao.modifyDao(Integer.parseInt(request.getParameter("pno")), request.getParameter("pname"), Integer.parseInt(request.getParameter("pcount")), request.getParameter("pcountry"), request.getParameter("pcolor"), request.getParameter("ptext"), Integer.parseInt(request.getParameter("pcontent")));
			return "redirect:winelist";
		}
	

}
