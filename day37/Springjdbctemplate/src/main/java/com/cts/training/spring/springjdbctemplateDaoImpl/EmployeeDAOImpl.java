package com.cts.training.spring.springjdbctemplateDaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.cts.training.spring.springjdbctemplate.Employee;
import com.cts.training.spring.springjdbctemplateDao.EmployeeDao;

public class EmployeeDAOImpl implements EmployeeDao
{
	private JdbcTemplate jdbcTemplate; 
	 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
		this.jdbcTemplate = jdbcTemplate;
		}

	public boolean addEmployee(Employee employee) {
		String query = "insert into employee values(?,?,?,?,?)";  
		try { 
			jdbcTemplate.update(query, employee.getEmpId(), 
										employee.getEmpName(),
										employee.getEmpAddress(), 
										employee.getEmail(), 
										employee.getMobile());  
			return true;  
			} catch (DataAccessException e) 
		{    e.printStackTrace(); 
		return false;
		}  
	}

	public boolean deleteEmployee(Employee employee) {
		
		String query = "delete from employee where empId =?";  
		try {   
			jdbcTemplate.update(query, employee.getEmpId());   
			return true;  
			} catch (DataAccessException e) {   
				e.printStackTrace(); 
				return false;   
				}  
	}

	public boolean updateEmployee(Employee employee) {
		
	String query = "update employee set name=?, address=?,email=?,mobile=? where id =?";
		try { 
			jdbcTemplate.update(query, employee.getEmpName(), employee.getEmpAddress(), employee.getEmail(),employee.getMobile(), employee.getEmpId());  
			return true;
			}   catch (DataAccessException e) { 
			e.printStackTrace(); 
				return false; 
		}
	}

	public Employee getEmployeeById(int empId) {
		String query = "select * from employee where empId = ?";   
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class); 
		return jdbcTemplate.queryForObject(query, rowMapper, empId); 
	}

	public List<Employee> getAllEmployees() {
	
		String sql = "SELECT * FROM employee";  
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);   
		return this.jdbcTemplate.query(sql, rowMapper); 
	}
	

}
