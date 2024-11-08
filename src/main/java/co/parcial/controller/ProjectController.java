package co.parcial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.parcial.entities.Project;
import co.parcial.services.ProjectService;


@RestController
@RequestMapping("/proyecto")
public class ProjectController {

	
	@Autowired
	public ProjectService projectService;
	
	@GetMapping()
	public List<Project> listar(){
		return projectService.listar();
	}
	
	@PutMapping("/{id}")
	public Project update(@PathVariable Integer id, @RequestBody Project proyect) {
		return projectService.update(id, proyect);
	}
}
