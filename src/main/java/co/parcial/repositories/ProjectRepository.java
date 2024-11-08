package co.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.parcial.entities.Project;

public interface ProjectRepository  extends JpaRepository<Project, Integer> {

}
