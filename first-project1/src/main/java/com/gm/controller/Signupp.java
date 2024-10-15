package com.gm.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gm.model.Registerr;

public class Signupp extends HttpServlet {
		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			int userid=Integer.parseInt(request.getParameter("userid"));
			String uname=request.getParameter("uname");
			int phoneno=Integer.parseInt(request.getParameter("phoneno"));
			String address=request.getParameter("address");
			
			Registerr re=new Registerr();	
			re.setUserid(userid);
			re.setUname(uname);
			re.setPhoneno(phoneno);
			re.setAddress(address);
			 int rows=re.addResult();
				if(rows==1) {
					response.sendRedirect("/first-project1/addResultSuccess1.html");
				}
				else {
					response.sendRedirect("/first-project1/addResultFailure1.html");
				}
				
		}
	}
