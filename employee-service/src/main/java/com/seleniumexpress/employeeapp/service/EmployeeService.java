package com.seleniumexpress.employeeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.employeeapp.entity.Employee;
import com.seleniumexpress.employeeapp.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	public Employee getEmployeeById(int id) {

		Employee employee = employeeRepo.findById(id).get();
		return employee;
	}

}
