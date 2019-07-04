package com.eksad.latihanspringmvc.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller


public class HelloControler {
	
//	@RequestMapping("/namasaya/{myName}")
//	@ResponseBody
//	
//	public String sayHello() {
//		return "Helo World";
	
//	RequestParam memasukkan pariabel dengan ? berfungsi untuk menampung paramater
//	RequestMapping untuk mapping url
//	pathVariable mengambil dari variabel dan variabelnya wajib di isi
	
	
//	public String myName(@RequestParam String myName) {
//		return "Helo" + myName;
	
//	public String namasaya(@PathVariable String myName) {
//		return "Helo" + myName;
	
//		@RequestMapping("/toGoogle")
//		@ResponseBody
//		
//		public String toGoogle() {
//			return "<a href='https://www.google.com'> KLIK disini menuju Google </a>"
//					+ "<br> <a href='https://www.youtube.com'> KLIK disini menuju Youtube </a>"
//					+ "<br> <a href='https://www.facebook.com'> KLIK disini menuju Facebook </a>";
		
	
		@RequestMapping("/toGoogle")
		@ResponseBody
		
		public String toGoogle() {
			return "<a href='https://www.google.com' target='blank'> KLIK disini menuju Google </a>"
					+ "<br> <a href='https://www.youtube.com'> KLIK disini menuju Youtube </a>"
					+ "<br> <a href='https://www.facebook.com'> KLIK disini menuju Facebook </a>";
	}
	
	

}
