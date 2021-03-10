package com.board.sophyapp.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.sophyapp.model.MemberVO;
import com.board.sophyapp.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	MemberService memberService;

	@GetMapping("/memberlist")
	public String memberList(Model model) throws Exception {
		logger.info("member Controller - MemberList \n");

		List<MemberVO> memberList = memberService.memberList();

		model.addAttribute("memberList", memberList);
		model.addAttribute("name", "sophy");



		return "member/memberInfo";
	}



}
