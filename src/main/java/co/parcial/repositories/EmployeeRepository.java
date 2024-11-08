package co.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.parcial.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
