package com.gm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gm.model.LoginClass;


public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int uid=Integer.parseInt(request.getParameter("uid"));
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		
		 LoginClass dc=new  LoginClass();
		
		 dc.setUname(uname);
		 dc.setPassword(password);
		
		 int res=dc.addResult();
			if(res==1) {
				response.sendRedirect("/first-project1/addResultSuccess.html");
			}
			else {
				response.sendRedirect("/first-project1/addResultFailure.html");
			}
			
			
			
			
	}

}
