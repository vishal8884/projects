package com.test;

import com.telusko.web.dao.AdminUserAndPassDao;
import com.telusko.web.dao.AfterLoginDao;
import com.telusko.web.dao.AlienDao;
import com.telusko.web.dao.ClientNewUserDao;
import com.telusko.web.model.AdminUserAndpass;
import com.telusko.web.model.AfterLogin;
import com.telusko.web.model.ClientNewUser;

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	AdminUserAndPassDao ob= new AdminUserAndPassDao();
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
		*/
	    AfterLoginDao ald= new AfterLoginDao();
		AfterLogin al = ald.readRemedy("cough and sore throat");//cough and sore throat
		System.out.println(al);
		
		
	}

}
