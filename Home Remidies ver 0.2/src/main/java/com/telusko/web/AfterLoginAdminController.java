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

public class AfterLoginAdminController extends HttpServlet {
	
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String adddisease=request.getParameter("diseaseadd");
		String addremedy1=request.getParameter("remedy1add");
		String addremedy2=request.getParameter("remedy2add");
		String addremedy3=request.getParameter("remedy3add");
		
		//String getdisease=request.getParameter("diseaseget");
		
		
		AfterLoginDao afterlogindao = new AfterLoginDao();
		
		
		//AfterLogin afterlogingetremedies=afterlogindao.readRemedy(getdisease);
		
		afterlogindao.saveRemedy(adddisease, addremedy1, addremedy2, addremedy3);
		
		
		//HttpSession session = request.getSession();
		//session.setAttribute("afterlogingetremedies", afterlogingetremedies);
		
		response.sendRedirect("DataInsertedSucessfully.jsp");
	}

///////////////////////////////Second Method ///////////////////////////////////////////////////////////

}
