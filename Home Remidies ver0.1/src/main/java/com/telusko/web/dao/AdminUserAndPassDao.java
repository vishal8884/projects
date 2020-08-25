package com.telusko.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.telusko.web.model.AdminUserAndpass;
import com.telusko.web.model.Alien;

public class AdminUserAndPassDao {
	
	public AdminUserAndpass getAdmin(String adminname1,String adminpassword1)
	{
		Alien a = new Alien();
		
		AdminUserAndpass admin= new AdminUserAndpass();
		
		boolean check=false;
		//int id=0;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement st = con.createStatement();
			//String sql="select * from admin where adminname='"+adminname+"' and adminpassword='"+adminpassword+"';";
			String sql="select adminname,adminpassword from admin where adminname='"+adminname1+"' and adminpassword='"+adminpassword1+"';";
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				//a.setAid(rs.getInt("aid"));
				//a.setAname(rs.getString("aname"));
				//a.setTech(rs.getString("tech"));
				
				admin.setAdminname(rs.getString("adminname"));
				admin.setAdminpassword(rs.getString("adminpassword"));
				
				
				String aname=admin.getAdminname();
				String apass=admin.getAdminpassword();
				
				System.out.println("aname : "+aname);
				System.out.println("apass : "+apass);
				
				
				
				
			}
			//rs.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return admin;
		
	}

}
