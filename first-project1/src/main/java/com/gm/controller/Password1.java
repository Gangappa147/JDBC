package com.gm.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gm.model.LoginClass;
import com.gm.model.PasswordClass1;


public class Password1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int uid=Integer.parseInt( request.getParameter("uid"));
		String password=request.getParameter("password");
		String Confirmpassword=request.getParameter("Confirmpassword");
		
		PasswordClass1 pc=new  PasswordClass1();
		pc.setUid(uid);
		pc.setPassword(password);
		pc.setConfirmpassword(Confirmpassword);
		int res=pc.addResult();
		if(res==1) {
			response.sendRedirect("/first-project1/ResultSuccess.html");
		}
		else {
			response.sendRedirect("/first-project1/ResultFailure.html");
		}
		
		
	}
	

}
