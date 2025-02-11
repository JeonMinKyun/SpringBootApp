package com.min.edu.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContorller {

	@GetMapping(value = "/")
	public String home() {
		System.out.println("(￣y▽￣)╭ Ohohoho..... 처음호출되는 요청 ");
		return "Hello";
	}
	
}
