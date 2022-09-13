package com.example.CollegeService.vo;

public class Student {
 private int student_id;
 private String sname;
 private int age;
 private String gender;
 private String stream;
 private int college_id;
 public Student(int student_id,String sname, int age, String gender, String stream, int college_id) {
	 super();
	 this.student_id =student_id;
	 this.sname = sname;
	 this.age = age;
	 this.gender = gender;
	 this.stream = stream;
	 this.college_id = college_id;
	 }
    public Student() {
    	
    }
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getCollege_id() {
		return college_id;
	}
	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}
    
 
 
 
 
 
 
 
 
 
 
 
}
