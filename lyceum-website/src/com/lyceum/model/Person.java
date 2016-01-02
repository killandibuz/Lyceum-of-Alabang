package com.lyceum.model;

import java.util.Date;

public class Person {

	private int skPerson;
	private Name name;
	private String strAddress;
	private long birthday;
	private String strGender;
	private String strEmail;
	private String strContactNo;
	
	public int getSkPerson() {
		return skPerson;
	}
	public void setSkPerson(int skPerson) {
		this.skPerson = skPerson;
	}
	public String getStrContactNo() {
		return strContactNo;
	}
	public void setStrContactNo(String strContactNo) {
		this.strContactNo = strContactNo;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getStrAddress() {
		return strAddress;
	}
	public void setStrAddress(String address) {
		this.strAddress = address;
	}
	public Date getBirthday() {
		return new Date(birthday);
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday.getTime();
	}
	public String getStrEmail() {
		return strEmail;
	}
	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
	public String getStrGender() {
		return strGender;
	}
	public void setStrGender(String strGender) {
		this.strGender = strGender;
	}
	
	public String toString(){
		return getName()+" -- "+getBirthday();
	}
	
}