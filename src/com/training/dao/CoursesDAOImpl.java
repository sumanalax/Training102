/**
 * 
 */
package com.training.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.training.model.Courses;

/**
 * @author Sumana
 *
 */
public class CoursesDAOImpl {
	
	public ArrayList loadCoursesDataFromDatabase() {
	    
	  ArrayList Courses = new ArrayList() ; 
	  try {  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con = DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/training?serverTimezone=EST","root","sumana");  
			//here training is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * FROM training.Courses;");  
				while(rs.next()) {
					Courses c = new Courses();
					c.setID(rs.getInt(1));
					c.setName(rs.getString(2));
					c.setID(rs.getInt(3));
					Courses.add(c);
					
				}
				con.close();
				
	            }catch (Exception e) {
		             
	            	System.out.println(e);
	  }
	        return Courses;
	}  
}	  
	  
         
