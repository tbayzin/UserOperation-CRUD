package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
<<<<<<< HEAD
	
	@RequestMapping("/Finland")
=======
		@RequestMapping("/Finland")
>>>>>>> 2afa64361b1891b714f181b213a140457dd81949
	public String Finland ()
	{
	
	return "Finland.jsp";

}
<<<<<<< HEAD
	// Showeveryone
	@RequestMapping( "/ShowEveryoneInDB.jsp")
	public ModelAndView ShowEveryoneInDB() {
		ModelAndView mv2 = new ModelAndView ("showPerson.jsp");
	
	   List<Person> person = (List<Person>) repo.findAll();
		return new ModelAndView("personId", "personName", getPerson(null));


	}
=======

>>>>>>> 2afa64361b1891b714f181b213a140457dd81949
	
	
	
	@RequestMapping("/getPerson")
	public ModelAndView getPerson (@RequestParam Integer personId)
	{
		ModelAndView mv = new ModelAndView ("showPerson.jsp");
	     Person person = repo.findById(personId).orElse(new Person());
	     mv.addObject(person);
	return mv;

}
	
	
}
