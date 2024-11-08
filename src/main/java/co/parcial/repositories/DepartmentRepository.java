package co.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.parcial.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
