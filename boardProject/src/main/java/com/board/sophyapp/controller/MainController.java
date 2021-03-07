package com.board.sophyapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


	//@RequestMapping(value = "/main")
	@GetMapping("/main")
	public String mainPage() {


		return "main/main";
	}

}
