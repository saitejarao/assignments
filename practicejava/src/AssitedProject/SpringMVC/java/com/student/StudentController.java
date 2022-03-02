package com.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	
	@RequestMapping("student")
	public ModelAndView student(@RequestParam("sid") int id,@RequestParam("sname") String name,@RequestParam("scity") String city)
	{
		ModelAndView mav=new ModelAndView();
		
		Student s=new Student();
		s.setSid(id);
		s.setSname(name);
		s.setScity(city);
		
		mav.setViewName("index.jsp");
		mav.addObject("raise",s);
		
		return mav;
	}
}
