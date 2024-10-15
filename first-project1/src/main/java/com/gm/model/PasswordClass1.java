package com.gm.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PasswordClass1 {
private int uid;
private String password;
private String Confirmpassword;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmpassword() {
	return Confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	Confirmpassword = confirmpassword;
}
public PasswordClass1(int uid, String password, String confirmpassword) {
	super();
	this.uid = uid;
	this.password = password;
	Confirmpassword = confirmpassword;
}
public PasswordClass1() {
	super();
}
@Override
public String toString() {
	return "PasswordClass1 [uid=" + uid + ", password=" + password + ", Confirmpassword=" + Confirmpassword + "]";
}


public int addResult() {
	
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ Password_db", "root", "Gangappa@123");
		
		String s2="insert into  password values(?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(s2);
		pstmt.setInt(1, uid);
		pstmt.setString(2,password);
		pstmt.setString(3, Confirmpassword);
		int res=pstmt.executeUpdate();
		return res;
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return 0;
	
}
}
