package com.example.CollegeService.vo;

import java.util.List;

import com.example.CollegeService.Entity.College;

public class ResponseTemplate {
	
	private College college;
	private List<Student> students;
	public ResponseTemplate() {
		super();
		
	}
	public ResponseTemplate(College college, List<Student> students) {
		super();
		this.college=college;
		this.students=students;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	

}
