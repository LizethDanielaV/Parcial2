package co.parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.parcial.entities.Employee;
import co.parcial.services.EmployeeService;



@RestController
@RequestMapping("/empleados")
public class EmployeeController {

	@Autowired
	public EmployeeService employeeService;
	
	@PostMapping()
	public Employee create(@RequestBody Employee emple) {
		
		Employee nuevoemple = employeeService.create(emple);
		return nuevoemple;
	}
}
