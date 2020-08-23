package com.main;

import java.util.List;

import com.controller.ControllerClass;
import com.controller.GetterSetter;

import com.jdbc.Dao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao dao= new Dao();
		dao.dao();
		
		GetterSetter gs1 =new GetterSetter("Beaf", "Cilantro", "Cumin", "Non-Vegetarian", "mexican");
		List<GetterSetter> listfood=dao.list(gs1);
		
		for(GetterSetter gs: listfood)
		{
			System.out.println(gs.getFood());
			//System.out.println(abook.getTitle());
		} 
		
		

	}

}
