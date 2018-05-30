/**
 * 
 */
package com.training.service;

import java.util.ArrayList;
import java.util.Iterator;

import com.training.model.Courses;

/**
 * @author kalyanramkoduru
 *
 */
public class CoursesService {
	
	  public void printCoursesData(ArrayList Courses) {
		  Iterator it = Courses.iterator();
		  Courses c =  (Courses)it.next();
		  System.out.println("Id:"+c.getId()+"Name:"
					+c.getName()+"Address:"+c.getId());	

}
}