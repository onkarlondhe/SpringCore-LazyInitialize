package com.mzos;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean {

	private int empId;
	private String empName;
	private double empSal;
	
	public Employee() {
		super();
		System.out.println("Non parameterized constructor called..");
	}
	
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		
		System.out.println("parameterized constructor called..");
	}
	
	public int getEmpId() {
 		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
		System.out.println("set method called..");
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public double getEmpSal() {
		return empSal;
	}
	
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after set method called..");
		empSal = empSal*2;
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method called...");
	}
	
	
}
