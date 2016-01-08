package com.lyceum.services.impl;

import com.lyceum.business.StudentBusiness;
import com.lyceum.model.Account;
import com.lyceum.model.Student;
import com.lyceum.services.StudentService;

public class StudentServiceImpl implements StudentService{

	private StudentBusiness studentBusiness;
	
	public void setStudentBusiness(StudentBusiness studentBusiness){
		this.studentBusiness = studentBusiness;
	}
	
	@Override
	public String getStudentCode() {
		// TODO Auto-generated method stub
		return studentBusiness.getStudentCode();
	}

	@Override
	public String registerStudent(Student student) {
		// TODO Auto-generated method stub
		return studentBusiness.registerStudent(student);
	}

	@Override
	public Student getStudent(Account account) {
		// TODO Auto-generated method stub
		return studentBusiness.getStudent(account);
	}
	
}
