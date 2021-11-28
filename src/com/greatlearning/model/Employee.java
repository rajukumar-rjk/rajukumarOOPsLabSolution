package com.greatlearning.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;

	// defining a constructor
	public Employee(String firstName, String lastName, String department) {	
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;

	}
	
	// getter and setter
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
