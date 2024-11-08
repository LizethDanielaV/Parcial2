package co.parcial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.parcial.entities.Employee;
import co.parcial.repositories.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee create(Employee empleado) {
		return employeeRepository.save(empleado);
	}
}
