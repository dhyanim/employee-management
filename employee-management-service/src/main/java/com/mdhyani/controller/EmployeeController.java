package com.mdhyani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mdhyani.dao.EmployeeDAO;
import com.mdhyani.model.Employee;

//for allowing call from react app
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;

	@RequestMapping(value = "/employee", method= RequestMethod.POST)
	public Employee saveEmployee(@RequestBody Employee emp) {
		
		employeeDAO.save(emp);
		return emp;
	}
	
	@RequestMapping(value = "/employee/{Id}", method= RequestMethod.GET)
	public Employee getEmployee(@PathVariable("Id") Long Id) {
		
		return employeeDAO.getEmployeeById(Id);
	}
	
	@RequestMapping(value = "/employees")
	public List<Employee> getEmployeesList() {
		
		return employeeDAO.getEmployees();
	}

}
