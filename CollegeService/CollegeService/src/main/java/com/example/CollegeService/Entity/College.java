package com.example.CollegeService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int clgId;
	private String cname;
	private int totalStudents;
	public College(String cname, int totalStudents) {
		super();
		this.cname = cname;
		this.totalStudents = totalStudents;
		
	}
	public College() {
		super();
	}
	public int getClgId() {
		return clgId;
	}
	public void setClgId(int clgId) {
		this.clgId = clgId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getTotalStudents() {
		return totalStudents;
	}
	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
