package com.board.sophyapp.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.sophyapp.model.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	SqlSession sqlSession;

	@Override
	public List<MemberVO> selectMemberInfo() throws Exception {

		return sqlSession.selectList("member.selectMemberInfo");
	}

}
