package com.telusko.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.telusko.web.dao.AfterLoginDao;
import com.telusko.web.dao.ClientNewUserDao;
import com.telusko.web.model.AfterLogin;
import com.telusko.web.model.ClientNewUser;

public class AfterAdminLoginReadController extends HttpServlet {
	
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		
		String getdisease=request.getParameter("diseaseget");
		
		
		AfterLoginDao afterlogindao = new AfterLoginDao();
		
		
		AfterLogin afterlogingetremedies=afterlogindao.readRemedy(getdisease);
		
		
		
		
		HttpSession session = request.getSession();
		session.setAttribute("afterlogingetremedies", afterlogingetremedies);
		
		response.sendRedirect("FinalAdminRead.jsp");
	}

///////////////////////////////Second Method ///////////////////////////////////////////////////////////

}