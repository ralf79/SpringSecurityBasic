package com.hw.sec.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hw.sec.service.BoardService;

@Controller
public class EmpController {

	@Autowired
	BoardService bs;
	
	@RequestMapping("/admin")
	public String getlist(Model model){
		System.out.println(bs.getList().size());
		model.addAttribute("list", bs.getList());
		
		return "admin";
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("/denied")
	public String denied(Model model) {
		return "denied";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
}
