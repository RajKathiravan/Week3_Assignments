package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name is Raj");

	}
	public void studentDept() {
		System.out.println("Student Dept is PED");

	}
	public void studentId() {
		System.out.println("Student ID is 7774");

	}
	public static void main(String[] args) {
		Student StdObj = new Student();
		StdObj.collegeName();
		StdObj.collegeCode();
		StdObj.collegeRank();
		StdObj.deptName();
		StdObj.studentName();
		StdObj.studentId();
		StdObj.studentDept();
	}
}
