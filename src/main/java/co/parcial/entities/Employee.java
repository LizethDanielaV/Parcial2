package co.parcial.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	private LocalDate birthdate;
	
	@ManyToOne
	@JoinColumn(name = "dep_id")
	private Department departamento;
	
	@OneToMany(mappedBy = "chief", cascade= CascadeType.ALL)
	@JsonIgnore
	List<Department> departamentos;
	
	@ManyToMany
	@JoinTable(
			  name = "visit", 
			  joinColumns = @JoinColumn(name = "employee_id"), 
			  inverseJoinColumns = @JoinColumn(name = "department_id"))
	List<Department> departamentosVisit;
	
	
	@ManyToOne
	@JoinColumn(name = "pos_id")
	private Position posicion;
	
	@OneToMany(mappedBy = "empleado", cascade= CascadeType.ALL)
	@JsonIgnore
	List<ProjectAssignment> proyectosAsinados;
	
}
