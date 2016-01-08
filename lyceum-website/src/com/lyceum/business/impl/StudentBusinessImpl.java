package com.lyceum.business.impl;

import com.lyceum.business.StudentBusiness;
import com.lyceum.conversion.SmartCounter;
import com.lyceum.dao.StudentRepository;
import com.lyceum.model.Account;
import com.lyceum.model.Student;

public class StudentBusinessImpl implements StudentBusiness{

	private StudentRepository studentRepository;
	
	public void setStudentRepository(StudentRepository studentRepository){
		this.studentRepository = studentRepository;
	}
	
	@Override
	public String getStudentCode() {
		// TODO Auto-generated method stub
		String strStudentCode = studentRepository.getLastStudentCode();
		if (strStudentCode == null){
			return "00001";
		}
		else if(!strStudentCode.equals("errorInDatabase")){
			return SmartCounter.newCode(strStudentCode);
		}
		return strStudentCode;
	}

	@Override
	public String registerStudent(Student student) {
		// TODO Auto-generated method stub
		try{
			
			if (student.getAccount().getStrUsername() == null || student.getAccount().getStrUsername().equals("")){
				throw new IllegalArgumentException();
			}
			if (student.getAccount().getStrPassword() == null || student.getAccount().getStrPassword().equals("")){
				throw new IllegalArgumentException();
			}
			if (student.getBirthday() == null){
				throw new IllegalArgumentException();
			}
			if (student.getAddress().getFullAddress() == null || student.getAddress().getFullAddress().equals("")){
				throw new IllegalArgumentException();
			}
			if (student.getStrContactNo() == null || student.getStrContactNo().equals("")){
				throw new IllegalArgumentException();
			}
			if (student.getStrEmail() == null || student.getStrEmail().equals("")){
				throw new IllegalArgumentException();
			}
			if (student.getStrGender() == null || student.getStrGender().equals("")){
				throw new IllegalArgumentException();
			}
			if (student.getStrStudentCode() == null || student.getStrStudentCode().equals("")){
				throw new IllegalArgumentException();
			}
			if (student.getName().getStrFirstName() == null || student.getName().getStrFirstName().equals("")){
				throw new IllegalArgumentException();
			}
			if (student.getName().getStrLastName() == null || student.getName().getStrLastName().equals("")){
				throw new IllegalArgumentException();
			}
			return studentRepository.addStudent(student);
			
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		return "errorInValidation";
	}

	@Override
	public Student getStudent(Account account) {
		// TODO Auto-generated method stub
		try{
			
			if (account.getStrUsername().equals("") || account.getStrUsername() == null){
				throw new IllegalArgumentException();
			}
			return studentRepository.getStudentInfo(account);
			
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		return null;
	}

}
