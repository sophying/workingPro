package com.board.sophyapp.model;

import lombok.Data;

@Data
public class BoardVO {

/*
 	2021-03-07
	CREATE TABLE tbl_board(
	bid INT AUTO_INCREMENT COMMENT '�Ϸù�ȣ' PRIMARY KEY,
	category VARCHAR(20) NOT NULL COMMENT '�Խñ� ī�װ�',
	title VARCHAR(200) NOT NULL COMMENT '����',
	content VARCHAR(4000) NOT NULL COMMENT '�Խñ�',
	tag VARCHAR(1000) NULL COMMENT'�±�',
	view_count int DEFAULT 0 NOT NULL COMMENT '��ȸ��',
	reg_id VARCHAR(45) NOT NULL COMMENT '�ۼ���',
	reg_date DATE NOT NULL COMMENT '�ۼ���',
	edit_date DATE NOT NULL COMMENT '������'
);

*/
	public int bid;
	public String category;
	public String title;
	public String content;
	public String tag;
	public int view_count;
	public String reg_id;
	public String reg_date;
	public String edit_date;
}
