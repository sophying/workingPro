package com.board.sophyapp.service;

import java.util.List;

import com.board.sophyapp.model.MemberVO;

public interface MemberService {

	public List<MemberVO> memberList() throws Exception;
	public int memberJoin(MemberVO memberVO) throws Exception;

}
