package com.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdbc.Dao;
import com.main.Test;

@Controller
public class ControllerClass {
	

	
//	Dao dao=new Dao();
	Test t =new Test();
	
	
	
	
	@RequestMapping("/")
	public String index()
	{
		
		return "index.jsp";
	}
	
	
	
	
	//This is going to be output page
	@RequestMapping("/output")
	public String output(@ModelAttribute("gs") GetterSetter gs
			
			,HttpServletRequest req,Model m)
	{
		
	//	dao.dao();
	//	List<GetterSetter> listfood=dao.list(gs);
		
		
		
		
	//	m.addAttribute("listfood",listfood); 
		String food=t.test(gs.getDiet(), gs.getCuisine(),gs.getIngridient1(), gs.getIngridient2(), gs.getIngridient3());
		m.addAttribute("gs", gs);
		m.addAttribute("food",food);
		return "output.jsp";
	}
	

}
