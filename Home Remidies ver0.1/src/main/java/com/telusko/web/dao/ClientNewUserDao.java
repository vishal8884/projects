package com.telusko.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.telusko.web.model.Alien;
import com.telusko.web.model.ClientNewUser;

public class ClientNewUserDao {
	
	public void saveClientNewUser(String newuser,String newpass)
	{
    //Alien a = new Alien();
    ClientNewUser clientnew= new ClientNewUser();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement st = con.createStatement();
			
			String sql = "INSERT INTO client (clientname, clientpassword) VALUES ('"+newuser+"', '"+newpass+"');";
			
			//String sql1 = "INSERT INTO alien (aid, aname, tech) VALUES (5, 'hari', 'c++');";
			
			st.executeUpdate(sql);
			
		      
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
		
		
	}

}
