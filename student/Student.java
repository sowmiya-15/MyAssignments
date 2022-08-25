package org.student;

import org.college.College;

public class Student extends College {
	public void StudentName() {
		System.out.println("StudentName");
	}
	public void StudentDepartment() {
		System.out.println("StudentDepartment");
	}
	public void StudentId() {
		System.out.println("StudeneId");
	}
	public static void main(String[] args) {
		Student student=new Student();
		student.CollegeName();
		student.CollegeCode();
		student.CollegeRank();
		student.departName();
		student.StudentName();
		student.StudentId();
		student.StudentDepartment();
	}
	


	
		
	}

