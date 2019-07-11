package com.mdhyani;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mdhyani.dao.EmployeeDAO;
import com.mdhyani.model.Employee;

@SpringBootApplication
public class SpringBootInitializer {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootInitializer.class, args);
	}

	@Bean
    public CommandLineRunner init(EmployeeDAO employeeDAO) {
		
        return args -> { 
        	
        	employeeDAO.save(new Employee("Mayank", 20000.0));
        	employeeDAO.save(new Employee("John", 50000.0));
        	employeeDAO.save(new Employee("David", 70000.0));
        	employeeDAO.save(new Employee("Shawn", 60000.0));
        	employeeDAO.save(new Employee("Michael", 80000.0));
        	
        };
    }
}
