/**
 * 
 */
package com.training.mains;

import java.util.ArrayList;

import com.training.dao.CoursesDAOImpl;
import com.training.service.CoursesService;

/**
 * @author kalyanramkoduru
 *
 */
public class CoursesApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoursesDAOImpl coursesDAO = new CoursesDAOImpl();
		ArrayList courses = coursesDAO.loadCoursesDataFromDatabase();  
		
		CoursesService coursesService = new CoursesService();
		coursesService.printCoursesData(courses);

	}

}
