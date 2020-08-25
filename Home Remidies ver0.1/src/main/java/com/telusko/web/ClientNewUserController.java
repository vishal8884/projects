package com.telusko.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.telusko.web.dao.AlienDao;
import com.telusko.web.dao.ClientNewUserDao;
import com.telusko.web.model.Alien;
import com.telusko.web.model.ClientNewUser;

public class ClientNewUserController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String newusername=request.getParameter("newusername");
		String newpassword=request.getParameter("newuserpassword");
		
		
		
		ClientNewUserDao clientnewuserdao= new ClientNewUserDao();
		
		ClientNewUser clientnewuser = new ClientNewUser();
		
		
		clientnewuserdao.saveClientNewUser(newusername, newpassword);
		
		
		HttpSession session = request.getSession();
		session.setAttribute("newuser", clientnewuser);
		
		response.sendRedirect("UserLogin.jsp");
	}

	

}