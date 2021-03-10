package com.board.sophyapp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.sophyapp.dao.MemberDAO;
import com.board.sophyapp.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Inject
	MemberDAO memberDAO;

	@Override
	public List<MemberVO> memberList() throws Exception {
		return memberDAO.selectMemberInfo();
	}


}
