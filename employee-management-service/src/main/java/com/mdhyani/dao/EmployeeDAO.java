package com.mdhyani.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mdhyani.model.Employee;

@Service
public interface EmployeeDAO {
	
	public void save(Employee emp);
	
	public List<Employee> getEmployees();
	
	public Employee getEmployeeById(Long Id);
}
