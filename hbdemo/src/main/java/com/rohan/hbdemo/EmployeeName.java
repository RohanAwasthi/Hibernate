package com.rohan.hbdemo;

import jakarta.persistence.Embeddable;
@Embeddable
public class EmployeeName {
private String fname;
private String lname;

public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}

}
