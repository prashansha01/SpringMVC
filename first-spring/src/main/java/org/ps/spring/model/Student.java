package org.ps.spring.model;

import java.util.ArrayList;
import java.util.Date;

public class Student {
	private String studentName;
	private String studentId;
	private Long studentMobile;
	private Date studentDob;
	private String[] studentSkills;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}
	public String[] getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(String[] studentSkills) {
		this.studentSkills = studentSkills;
	}
	
	
}
