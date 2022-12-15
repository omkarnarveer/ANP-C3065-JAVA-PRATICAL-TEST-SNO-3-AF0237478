
package org.hitech.service;
import java.util.HashMap;

import org.hitech.dao.Student_Course_DAO;
import org.hitech.model.Course;
import org.hitech.model.Student;

public class Student_Course_Service {
	
	private Student_Course_DAO student_Course_DAO;
	private Student studentObj=new Student();
	private Course courseObj=new Course();
	Student_Course_Service(Student_Course_DAO student_Course_DAO){
		this.student_Course_DAO = student_Course_DAO;
	}
	
	public void addStudentCourseDetails(){
		
	student_Course_DAO.addStudentCourseDetails(studentObj, courseObj);
	}
	
	public HashMap<Student,Course> getStudentCourseDetails(){
		return student_Course_DAO.getStudentCourseDetails();
	}

	public void deleteStudentCourseDetails() {
		student_Course_DAO.deleteStudentCourseDetails(studentObj);
	}
}
