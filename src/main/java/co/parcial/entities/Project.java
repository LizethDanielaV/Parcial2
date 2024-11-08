package co.parcial.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String descripcion;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	@OneToMany(mappedBy = "proyecto", cascade= CascadeType.ALL)
	@JsonIgnore
	List<ProjectAssignment> proyectosAsignados;
}
