package com.cts.stream;

import java.io.Serializable;

public class Employee implements Serializable {
		
	private static final long serialVersionUID = -8318051164295899499L;
		/**
	 * 
	 */

		private int id;
		private String name;
		transient private String address;
		private int age;
		private long phone;
		transient private double salary;

		public Employee(int id, String name, int age, long phone, String dept, String address, int salary) {
			// TODO Auto-generated constructor stub
			this.id = id;
			this.name = name;
			this.address = address;
			this.age = age;
			this.phone = phone;
			this.salary = salary;
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", phone="
					+ phone + ", salary=" + salary + "]";
		}
		
	}


















	

