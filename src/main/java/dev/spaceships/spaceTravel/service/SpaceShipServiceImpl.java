package dev.spaceships.spaceTravel.service;

import dev.spaceships.spaceTravel.dao.SpaceShipDAO;
import dev.spaceships.spaceTravel.entity.SpaceShipGeneric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class SpaceShipServiceImpl implements SpaceShipServic{
    @Autowired
    private SpaceShipDAO dao;
    //DAO Mapping service

    @Override
    @Transactional(readOnly = true) //No make changes in db
    public Iterable<SpaceShipGeneric> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true) //No make changes in db
    public Page<SpaceShipGeneric> finadAll(Pageable pageable) {
        return dao.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true) //No make changes in db
    public Optional<SpaceShipGeneric> findById(String name) {
        return dao.findById(name);
    }

    @Override
    @Transactional //Make changes in db
    public SpaceShipGeneric save(SpaceShipGeneric spaceShip) {
        return dao.save(spaceShip);
    }

    @Override
    @Transactional //Make changes in db
    public void deleteById(String name) {
        dao.deleteById(name);
    }

}
