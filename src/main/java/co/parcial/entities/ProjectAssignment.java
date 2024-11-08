package co.parcial.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="project_assignment")
public class ProjectAssignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee empleado;
	
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role rol;
	
	@ManyToOne
	@JoinColumn(name = "project_id")
	private Project proyecto;
	
}
