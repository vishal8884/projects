package com.telusko.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.telusko.web.dao.AdminUserAndPassDao;
import com.telusko.web.dao.AlienDao;
import com.telusko.web.model.AdminUserAndpass;
import com.telusko.web.model.Alien;

public class ClientUserAndPassController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*String adminname1=request.getParameter("adminname");
		String adminpassword1=request.getParameter("adminpassword");
		
		AdminUserAndPassDao adminDao=new AdminUserAndPassDao();
		
		AdminUserAndpass admin= adminDao.getAdmin(adminname1, adminpassword1);
		
		
		//dao.saveAlien(aid, aname, tech);
		
		
		HttpSession session = request.getSession();
		session.setAttribute("admin", admin);*/
		
		response.sendRedirect("AfterUserLogin.jsp");
	}

	

}

