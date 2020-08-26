package com.telusko.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.telusko.web.model.AdminUserAndpass;
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
	
/////////////////////Second Method///////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	public ClientNewUser getClient(String username1,String userpassword1)
	{
		
		
		ClientNewUser client = new ClientNewUser();
		
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement st = con.createStatement();
			//String sql="select adminname,adminpassword from admin where adminname='"+adminname1+"' and adminpassword='"+adminpassword1+"';";
			
			String sql="select clientname,clientpassword from client where clientname='"+username1+"' and clientpassword='"+userpassword1+"';";
			
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				
				
				//admin.setAdminname(rs.getString("adminname"));
				//admin.setAdminpassword(rs.getString("adminpassword"));
				
				client.setNewusername(rs.getString("clientname"));
				client.setNewpasswprd(rs.getString("clientpassword"));
				
				//String aname=admin.getAdminname();
				//String apass=admin.getAdminpassword();
				
				String cname=client.getNewusername();
				String cpass=client.getNewpasswprd();
				
				System.out.println("cname : "+cname);
				System.out.println("cpass : "+cpass);
				
				
				
				
			}
			//rs.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return client;
		
	}

}
