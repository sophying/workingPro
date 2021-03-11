package com.board.sophyapp.model;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberVO {

	private String email;
	private String pass;
	private Date reg_date;

}
