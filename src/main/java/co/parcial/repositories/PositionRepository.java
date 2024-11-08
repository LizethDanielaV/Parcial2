package co.parcial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.parcial.entities.Position;

public interface PositionRepository extends JpaRepository<Position, Integer> {

}
