package com.gm.model;


	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


	public class Registerr extends HttpServlet {
		private int userid;
		private String uname;
		private int phoneno;
		private String address;
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public int getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(int phoneno) {
			this.phoneno = phoneno;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Registerr(int userid, String uname, int phoneno, String address) {
			super();
			this.userid = userid;
			this.uname = uname;
			this.phoneno = phoneno;
			this.address = address;
		}
		public Registerr() {
			super();
		}
		@Override
		public String toString() {
			return "Register [userid=" + userid + ", uname=" + uname + ", phoneno=" + phoneno + ", address=" + address
					+ "]";
		}
		
		public int addResult() {
			
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Register", "root", "Gangappa@123");
				
				String s="insert into register values(?,?,?,?)";
				PreparedStatement pstmt=con.prepareStatement(s);
				pstmt.setInt(1, userid);
				pstmt.setString(2,uname);
				pstmt.setInt(3, phoneno);
				pstmt.setString(4,address);
				int rows=pstmt.executeUpdate();
				return rows;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 0;
			
			
		}

	}

