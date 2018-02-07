package org.ps.spring.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Size;

public class Student {
	private String studentName;
	@Size(min=1, max= 6)
	private String studentId;
	private Long studentMobile;
	private Date studentDob;
	private String[] studentSkills;
	//private ArrayList<String> studentSkills;
	private Address studentAddress;
	
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
	/*public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}*/
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
}
