package com.board.sophyapp.dao;

import java.util.List;

import com.board.sophyapp.model.MemberVO;

public interface MemberDAO {

	public List<MemberVO> selectMemberInfo() throws Exception;
	public int memberJoin (MemberVO memberVO) throws Exception;

}
