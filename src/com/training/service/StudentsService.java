package com.training.service;

import java.util.ArrayList;
import java.util.Iterator;

import com.training.model.Student1;

public class StudentsService {

	 public void printStudentsData(ArrayList students) {
		Iterator it = students.iterator();
		while(it.hasNext()) {
			Student1 s = (Student1)it.next();
			System.out.println("Id:"+s.getId()+"Name:"
			+s.getName()+"Address:"+s.getAddress());	 
		}
	}
}
