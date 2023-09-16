package com.model;

public class Employee {
	private int id;
	private String name;
	private String email;
	private int contact;
	private String city;
	private double salaryPerMonth;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String email, int contact, String city, double salaryPerMonth) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.city = city;
		this.salaryPerMonth = salaryPerMonth;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}
	public void setSalaryPerMonth(double salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}
	public String toString() {
		return id+" "+name+" "+email+" "+contact+" "+city+" "+salaryPerMonth;
	}
}
