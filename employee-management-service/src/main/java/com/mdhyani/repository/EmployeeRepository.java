package com.mdhyani.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mdhyani.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	

}
