package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.Database;
import models.Doctor;

public class DoctorDatabase {
	static Connection con = Database.getConnection();
	Doctor dr = new Doctor();
	public  Doctor getDoctor(String username, String Psw) throws SQLException {
		 String query = "select * from doctor where username = ? and password = ?";
		 
	        PreparedStatement ps
	            = con.prepareStatement(query);
	        ps.setString(1, username);
	        ps.setString(2, Psw);
	        ResultSet rs = ps.executeQuery();
	     
	      boolean isnotnull=false;
	        while (rs.next()) {
	        	isnotnull=true;
	        	dr.setId(rs.getInt("idtable1"));
	        	dr.setMail(rs.getString("mail"));
	        	dr.setUsername(rs.getString("username"));
	        	dr.setName(rs.getString("name"));
	        	dr.setPassword(rs.getString("password"));
       	
		
	         }
	        if(isnotnull) {
	        	return dr;
	        }else {
	        	return null;
	        }
	      
	
		
	}
	
}
