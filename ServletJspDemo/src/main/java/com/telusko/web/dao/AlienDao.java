package com.telusko.web.dao;

import java.sql.*;
import com.telusko.web.model.Alien;

public class AlienDao 
{
	
	
	public Alien getAlien(int aid)
	{
		Alien a = new Alien();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from alien where aid=" + aid);
			if(rs.next())
			{
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return a;
	}
	
	public void saveAlien(int aid,String aname,String tech)
	{
    Alien a = new Alien();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement st = con.createStatement();
			
			String sql = "INSERT INTO alien (aid, aname, tech) VALUES ("+aid+", '"+aname+"', '"+tech+"');";
			
			//String sql1 = "INSERT INTO alien (aid, aname, tech) VALUES (5, 'hari', 'c++');";
			
			st.executeUpdate(sql);
			
		      
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
		
		
	}
	
}
