package co.parcial.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.parcial.entities.Department;
import co.parcial.repositories.DepartmentRepository;
import co.prueba.Models.Seleccion;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
public Department get(Integer id) {
		
		Optional<Department> departmentlOpt =  departmentRepository.findById(id);
		
		if (departmentlOpt.isPresent()) {
			return departmentlOpt.get();
		}
		return null;
	}
}
