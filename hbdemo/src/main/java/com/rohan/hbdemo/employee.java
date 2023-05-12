package com.rohan.hbdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class employee {
	@Id
private int id;


private EmployeeName name;
	
private String country;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public EmployeeName getName() {
	return name;
}

public void setName(EmployeeName name) {
	this.name = name;
}

@Override
public String toString() {
	return "employee [id=" + id + ", name=" + name + ", country=" + country + "]";
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}
	
}
