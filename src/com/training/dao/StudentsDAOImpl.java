/**
 * 
 */
package com.training.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

import com.training.model.Student1; 

/**
 * @author Sumana
 *
 */
public class StudentsDAOImpl {


	public ArrayList loadStudentsDataFromDatabase() {
		
		 ArrayList students = new ArrayList();
		try {  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con = DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/training?serverTimezone=EST","root","sumana");  
			//here training is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from training.students");  
				while(rs.next()) {
					Student1 s1 = new Student1();
					s1.setId(rs.getInt(1));
					s1.setName(rs.getString(2));
					s1.setName(rs.getString(3));
					students.add(s1);
				}
				con.close(); 
					//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				
		       }catch(Exception e){
		 
			      System.out.println(e);
            }
		      
		        return students;
	

		      }  

}
