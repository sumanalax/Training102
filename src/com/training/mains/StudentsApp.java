/**
 * 
 */
package com.training.mains;

import java.util.ArrayList;

import com.training.dao.StudentsDAOImpl;
import com.training.service.StudentsService;

/**
 * @author kalyanramkoduru
 *
 */
public class StudentsApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsDAOImpl studentsDAO = new StudentsDAOImpl();
		ArrayList students = studentsDAO.loadStudentsDataFromDatabase();  
		
		StudentsService studentService = new StudentsService();
		studentService.printStudentsData(students);

	}

}
