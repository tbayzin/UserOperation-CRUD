package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.PersonRepo;
import com.example.demo.model.Person;

@Controller
public class PersonController {
	
	
	@Autowired
	PersonRepo repo;
	

	
	@RequestMapping("/")
	public String home () {
		
		return "home.jsp";
	}
	
	@RequestMapping("/addPerson")
	public String addPerson (Person person)
	{
		repo.save(person);
	return "home.jsp";

}
	
	
	@RequestMapping("/Finland")
	public String Finland ()
	{
	
	return "Finland.jsp";

}

	

	@RequestMapping("/getPerson")
	public ModelAndView getPerson (@RequestParam Integer personId)
	{
		
		ModelAndView mv = new ModelAndView ("showPerson.jsp");
	     Person person = repo.findById(personId).orElse(new Person());
	     mv.addObject(person);
	return mv;

}
	
	
}