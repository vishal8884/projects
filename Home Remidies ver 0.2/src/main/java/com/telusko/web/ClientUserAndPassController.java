package com.telusko.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.telusko.web.dao.AdminUserAndPassDao;
import com.telusko.web.dao.AlienDao;
import com.telusko.web.dao.ClientNewUserDao;
import com.telusko.web.model.AdminUserAndpass;
import com.telusko.web.model.Alien;
import com.telusko.web.model.ClientNewUser;

public class ClientUserAndPassController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username1=request.getParameter("username");
		String userpassword1=request.getParameter("userpassword");
		
		ClientNewUserDao clientdao= new ClientNewUserDao();
		
		ClientNewUser client=clientdao.getClient(username1, userpassword1);
		
		
		HttpSession session = request.getSession();
		session.setAttribute("client", client);
		
		
		
		if(client.getNewusername()==null && client.getNewpasswprd()==null)
		{
			response.sendRedirect("UserLogin.jsp");
		}
		else
		{
			response.sendRedirect("AfterUserLogin.jsp");
		}
		
		
		
		
		
		
		
		
		
	}

	

}

