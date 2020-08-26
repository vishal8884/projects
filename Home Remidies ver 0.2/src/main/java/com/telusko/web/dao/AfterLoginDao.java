package com.telusko.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.telusko.web.model.AdminUserAndpass;
import com.telusko.web.model.AfterLogin;
import com.telusko.web.model.Alien;
import com.telusko.web.model.ClientNewUser;

public class AfterLoginDao {
	
	public AfterLogin readRemedy(String diseasename)
	{
		//Alien a = new Alien();
		
		//AdminUserAndpass admin= new AdminUserAndpass();
		
		AfterLogin alogin = new AfterLogin();
		
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement st = con.createStatement();
			//String sql="select * from admin where adminname='"+adminname+"' and adminpassword='"+adminpassword+"';";
			String sql="select * from diseaseAndRemidies where disease='"+diseasename+"';";
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				//a.setAid(rs.getInt("aid"));
				//a.setAname(rs.getString("aname"));
				//a.setTech(rs.getString("tech"));
				
				/*admin.setAdminname(rs.getString("adminname"));
				admin.setAdminpassword(rs.getString("adminpassword"));
				
				
				String aname=admin.getAdminname();
				String apass=admin.getAdminpassword();
				
				System.out.println("aname : "+aname);
				System.out.println("apass : "+apass);
				*/
				
				alogin.setDisease(rs.getString("disease"));//disease
				alogin.setRemedy1(rs.getString("remedy1"));
				alogin.setRemedy2(rs.getString("remedy2"));
				alogin.setRemedy3(rs.getString("remedy3"));
				
				String disease1=alogin.getDisease();
				String remedy1=alogin.getRemedy1();
				String remedy2=alogin.getRemedy2();
				String remedy3=alogin.getRemedy3();
				
				System.out.println("disease : "+disease1);
				System.out.println("remedy1 : "+remedy1);
				System.out.println("remedy2 : "+remedy2);
				System.out.println("remedy3 : "+remedy3);
				
				
				
			}
			//rs.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return alogin;
		
	}
	
	////////////////////////////////////SecondMethod///////////////////////////////////////////////
	
	
	public void saveRemedy(String disease,String remedy1,String remedy2,String remedy3)
	{
    //Alien a = new Alien();
   // ClientNewUser clientnew= new ClientNewUser();
    AfterLogin afterlogin= new AfterLogin();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement st = con.createStatement();
			
			String sql = "INSERT INTO diseaseAndRemidies (disease, remedy1,remedy2,remedy3) VALUES ('"+disease+"', '"+remedy1+"','"+remedy2+"','"+remedy3+"');";
			//String sql="select adminname,adminpassword from admin where adminname='"+adminname1+"' and adminpassword='"+adminpassword1+"';";
			
			
			st.executeUpdate(sql);
			
		      
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
	}

}
