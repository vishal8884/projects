package com.test;

import com.telusko.web.dao.AdminUserAndPassDao;
import com.telusko.web.dao.AlienDao;
import com.telusko.web.model.AdminUserAndpass;

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminUserAndPassDao ob= new AdminUserAndPassDao();
		AlienDao a11 = new AlienDao();
		
		//System.out.println(ob.getAdmin("default", "default"));
		
		
		AdminUserAndpass ob1=ob.getAdmin("default", "default");
		System.out.println(ob1);
		
		if(ob1.getAdminname()==null && ob1.getAdminpassword()==null)
		{
			System.out.println(false);
		}
		else
		{
			System.out.println(true);
		}
	}

}
