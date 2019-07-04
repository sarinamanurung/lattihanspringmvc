package com.eksad.latihanspringmvc.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/my")

public class MyControler {
//	@RequestMapping("/Hello")
//	public String Hello() {
//		return "Hello";
	
	
//	model menghubungkan data antara java ke html
	
	
		@RequestMapping("/myName")
		public String myName(@RequestParam String name, Model model) {
			model.addAttribute("name", name);
			return "myname";
	}
	
	

}
