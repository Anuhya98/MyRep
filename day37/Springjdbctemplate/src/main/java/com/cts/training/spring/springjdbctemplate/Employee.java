package com.cts.training.spring.springjdbctemplate;

public class Employee 
{
	private int empId;
	private String empName;
	private String email;
	private String empAddress;
	private long mobile;
	
	public Employee() {
		
	}
	public Employee(int empId, String empName, String email, String empAddress, long mobile) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.empAddress = empAddress;
		this.mobile = mobile;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmpAddress() {
		return empAddress;
	}


	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", empAddress=" + empAddress
				+ ", mobile=" + mobile + "]";
	}
	
	

}
