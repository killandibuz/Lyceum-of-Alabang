package com.lyceum.model;

public class Student extends Person{

	private String strStudentCode;
	
	public String getStrStudentCode() {
		return strStudentCode;
	}
	public void setStrStudentCode(String strStudentCode) {
		this.strStudentCode = strStudentCode;
	}
	
	public String toString(){
		return this.strStudentCode+" -- "+getAccount();
	}
	
}
