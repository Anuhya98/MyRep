package com.cts.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employeestream
{
	public static void main(String[] args)
	{
		List<Employee> employees=new ArrayList<Employee>();
		addEmployees(employees);
		//Employees with age less than 23
		List<Employee> ageScale=employees.stream().filter(emp -> emp.getAge() < 23 ).collect(Collectors.toList());
		System.out.println("Employees with age less than 23 are :/n");
		ageScale.forEach(System.out::println);
		//Name length is greater than 3
		List<Employee> nameScale=employees.stream().filter(emp -> emp.getName().length() > 5 ).collect(Collectors.toList());
		nameScale.forEach(System.out::println);
		//To increase salary by 10 percent
		List<Double> salIncrease=employees.stream().map(( Employee emp) -> emp.getSalary()*1.1).collect(Collectors.toList());
		System.out.println("The increased salary are : /n");
		salIncrease.forEach(System.out::println);
	}

	private static void addEmployees(List<Employee> employees) 
	{
		Employee emp1=new Employee(211,"Anu",22,98654,"Sales","Chennai",50000);
		Employee emp2=new Employee(105,"Abin",23,98854,"Sales","hyderabad",59706);
		Employee emp3=new Employee(212,"Kirthi",27,986547,"Sales","banglore",70000);
		Employee emp4=new Employee(210,"Cavin",25,98678,"Sales","delhi",40000);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
	} 

}
