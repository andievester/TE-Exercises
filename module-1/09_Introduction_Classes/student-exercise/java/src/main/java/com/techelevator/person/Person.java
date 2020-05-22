package com.techelevator.person;

public class Person {

	String firstName;
	String lastName;
	int age;

	public Person() {
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFullName() {
		return firstName + " " + lastName;
	}
	public boolean isAdult() {
		boolean isAdult = false;
		if(age >= 18) {
			return true;
		}
		return isAdult;
	}
}
