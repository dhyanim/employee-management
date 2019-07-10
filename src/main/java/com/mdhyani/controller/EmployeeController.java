package com.mdhyani.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdhyani.dao.EmployeeDAO;
import com.mdhyani.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;

	@RequestMapping(value = "/emp")
	public String saveEmployee() {
		
		Employee emp = new Employee();
		emp.setEmployeeName("mayank");
		emp.setHireDate(new Date());
		emp.setSalary(20000.0);
		employeeDAO.save(emp);;
		
		
		return "saved";
	}
	
	
	@RequestMapping(value = "/employees")
	public List<Employee> getEmployeesList() {
		return employeeDAO.getEmployees();
	}

}
