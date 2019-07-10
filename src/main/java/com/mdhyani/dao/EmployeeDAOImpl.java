package com.mdhyani.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdhyani.model.Employee;
import com.mdhyani.repository.EmployeeRepository;


@Service
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void save(Employee emp) {
		employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

}
