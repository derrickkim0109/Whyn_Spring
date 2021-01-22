package com.jsplec.wp.sub;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainSubController {

	@Autowired
	private SqlSession sqlSession;
	

	@RequestMapping("list")
	public String list(Model model) {
		MainSubIDao dao = sqlSession.getMapper(MainSubIDao.class);
		model.addAttribute("list", dao.listDao());
		
		return "list";
	}
}
