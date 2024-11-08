package co.parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.parcial.entities.Department;
import co.parcial.services.DepartmentService;



@RestController
@RequestMapping("/departamentos")
public class DerpartmentController {

	@Autowired
	public DepartmentService departmentService;
	
	@GetMapping("/{id}")
	public Department get(@PathVariable Integer id) {
		return departmentService.get(id);
	}
	
}
