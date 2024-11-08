package co.parcial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.parcial.entities.Project;
import co.parcial.repositories.ProjectRepository;


@Service
public class ProjectService {

	@Autowired
	ProjectRepository proyectRepository;
	
	public List<Project> listar(){
		return proyectRepository.findAll();
	}
}
