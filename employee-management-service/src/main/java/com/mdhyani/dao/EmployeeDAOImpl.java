package com.mdhyani.dao;

import java.util.Date;
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
		emp.setHireDate(new Date());
		employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long Id) {
		return employeeRepository.findById(Id).get();
	}

}
