package com.board.sophyapp.model;

import lombok.Data;

@Data
public class BoardVO {

/*
 	2021-03-07
	CREATE TABLE tbl_board(
	bid INT AUTO_INCREMENT COMMENT '일련번호' PRIMARY KEY,
	category VARCHAR(20) NOT NULL COMMENT '게시글 카테고리',
	title VARCHAR(200) NOT NULL COMMENT '제목',
	content VARCHAR(4000) NOT NULL COMMENT '게시글',
	tag VARCHAR(1000) NULL COMMENT'태그',
	view_count int DEFAULT 0 NOT NULL COMMENT '조회수',
	reg_id VARCHAR(45) NOT NULL COMMENT '작성자',
	reg_date DATE NOT NULL COMMENT '작성일',
	edit_date DATE NOT NULL COMMENT '수정일'
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
