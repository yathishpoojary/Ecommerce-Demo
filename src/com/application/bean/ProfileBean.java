package com.application.bean;

public class ProfileBean 
{
	private String name,userName,password,mail;
	private long phoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public ProfileBean(String name,String userName,String mail,String password,long phoneNumber)
	{
		this.name=name;
		this.userName=userName;
		this.mail=mail;
		this.password=password;
		this.phoneNumber=phoneNumber;
	}
	public ProfileBean( String password2, long phoneNumber2) 
	{
		this.password=password2;
		this.phoneNumber=phoneNumber2;
	}
	
	
}
