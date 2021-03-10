package com.board.sophyapp;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.sophyapp.model.MemberVO;
import com.board.sophyapp.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"
		,"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class MemberInfoTest {

	private static final Logger logger = LoggerFactory.getLogger(MemberInfoTest.class);

	@Inject
	SqlSession sqlSession;

	@Inject
	MemberService memberService;

	@Test
	public void testList() throws Exception{

		List<MemberVO> list = memberService.memberList();

		if (list != null) {
			System.out.println("\n ¼º°ø");
		}

	}
}
