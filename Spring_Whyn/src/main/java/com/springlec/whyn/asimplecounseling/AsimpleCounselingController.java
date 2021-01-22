package com.springlec.whyn.asimplecounseling;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class AsimpleCounselingController {
	@Autowired
	private SqlSession sqlSession;//sql 세션 불러오기
}
