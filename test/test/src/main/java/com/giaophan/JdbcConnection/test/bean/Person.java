package com.giaophan.JdbcConnection.test.bean;

import java.util.Date;


public class Person {
	
	int id;
	String name;
	String location;
	Date birth_date;
	public Person() {
		
	}
	public Person(int id, String name, String location, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birth_date = birthdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirthDate() {
		return birth_date;
	}
	public void setBirthDate(Date birthdate) {
		this.birth_date = birthdate;
	}
	
	

}
