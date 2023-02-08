package dev.spaceships.spaceTravel.dao;

import dev.spaceships.spaceTravel.entity.SpaceShip;
import dev.spaceships.spaceTravel.entity.SpaceShipGeneric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Working with pagination , with the interface JpaRepository on the server side :D
@Repository
public interface SpaceShipDAO extends JpaRepository<SpaceShipGeneric,String> {

}
