package co.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.parcial.entities.Role;

public interface RoleRepository  extends JpaRepository<Role, Integer>{

}
