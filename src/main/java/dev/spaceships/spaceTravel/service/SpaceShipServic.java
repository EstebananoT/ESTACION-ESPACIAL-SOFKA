package dev.spaceships.spaceTravel.service;

import dev.spaceships.spaceTravel.entity.SpaceShip;
import dev.spaceships.spaceTravel.entity.SpaceShipGeneric;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface SpaceShipServic {
    public Iterable<SpaceShipGeneric> findAll();

    public Page<SpaceShipGeneric> finadAll(Pageable pegable);
    public Optional<SpaceShipGeneric> findById(String name);

    public SpaceShip save(SpaceShipGeneric spaceShip);

    public void deleteById(String name);
}
