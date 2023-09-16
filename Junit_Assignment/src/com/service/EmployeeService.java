package com.service;

import com.model.Employee;

public class EmployeeService {
	
	public double computePerAnnumSalary(Employee e) {
		double perAnnumSalary=e.getSalaryPerMonth()*12;
		return perAnnumSalary;
	}
	
public double  computeIncrement(Employee e) {
		
	if(e.getCity().equalsIgnoreCase("Mumbai")) {
	e.setSalaryPerMonth(e.getSalaryPerMonth()*1.05);
	return e.getSalaryPerMonth();
	}
	
	if(e.getCity().equalsIgnoreCase("Pune")) { 
	e.setSalaryPerMonth(e.getSalaryPerMonth()*1.03);
	return e.getSalaryPerMonth();
	}
	
	return 0;
}	
	
	public double computeTotalSalary(Employee[] arr) {
		double totalSalary=0;
		for(Employee e:arr) {
			totalSalary+=e.getSalaryPerMonth();
		}
		return totalSalary;
		
		
	}
}
