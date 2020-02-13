package com.cts.training.spring.springjdbctemplateController;

import java.io.FileNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.spring.springjdbctemplate.Employee;
import com.cts.training.spring.springjdbctemplateDao.EmployeeDao;

public class EmployeeController{
public static void main(String args[]) throws FileNotFoundException
{

	ApplicationContext context=new ClassPathXmlApplicationContext("./beans.xml");
	EmployeeDao employeeDao=(EmployeeDao)context.getBean("employeeDAOImpl");
	
	//Employee employee=new Employee(112, "Sanjana", "Hyd", "sanju@email.com",987567);
	//System.out.println(employeeDao.addEmployee(employee));
	
	Employee employee=employeeDao.getEmployeeById(112);
	//System.out.println(employeeDao.getEmployeeById(112));
	//System.out.println(employeeDao.deleteEmployee(employee));
	System.out.println(employeeDao.updateEmployee(employee));
	
	
	//System.out.println(employeeDao.getAllEmployees());

}
}
