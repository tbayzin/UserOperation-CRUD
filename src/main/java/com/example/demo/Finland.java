package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Person;

public class Finland {
	
	@RequestMapping("/Finland.jsp")
	public String Finland () {
		
		return "Finland.jsp";
	}
}
