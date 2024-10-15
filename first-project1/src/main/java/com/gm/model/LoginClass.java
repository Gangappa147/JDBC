package com.gm.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginClass {
   private int uid;
   private static String uname;
   private String password;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public LoginClass(int uid, String uname, String password) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.password = password;
}
public LoginClass() {
	super();
}
@Override
public String toString() {
	return "DoctorClass [uid=" + uid + ", uname=" + uname + ", password=" + password + "]";
}
   

public int addResult() {
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userDetails", "root", "Gangappa@123");
		
		String s="insert into user7 values(?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(s);
		pstmt.setInt(1, uid);
		pstmt.setString(2,uname);
		pstmt.setString(3, password);
		int res=pstmt.executeUpdate();
		return res;
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return 0;
}
}
