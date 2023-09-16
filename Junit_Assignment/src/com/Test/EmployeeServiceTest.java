package com.Test;

import org.junit.Assert;
import org.junit.Test;

import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeServiceTest {
	EmployeeService e=new EmployeeService();
	Employee e1=new Employee(1,"yash","yashgmail.com",98439493,"pune",55000);
	Employee e2=new Employee(1,"azhar","azhargmail.com",953293493,"mumbai",98000);
	
	Employee[] arr= {e1,e2};
	@Test
	public void computeAnnualsalary(){
		Assert.assertEquals(660000,Math.round(e.computePerAnnumSalary(e1)));
	}
	@Test
	public void computeIncrement() {
		Assert.assertEquals(56650, Math.round(e.computeIncrement(e1)));
	}
	
	@Test
	public void computeTotalSalary() {
		Assert.assertEquals(153000,Math.round(e.computeTotalSalary(arr)));
	}
}

