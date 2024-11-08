package co.parcial.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
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
	
	public Project update(Integer id, Project project) {
		
		Optional<Project> projectOpt =  proyectRepository.findById(id);
		
		if (projectOpt.isPresent()) {
			
			Project projectUpd = projectOpt.get();
			
			BeanUtils.copyProperties(project, projectUpd);
			
			proyectRepository.save(projectUpd);
			
			return projectUpd;
		}
		return null;
	}

}
