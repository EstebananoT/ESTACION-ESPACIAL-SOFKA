package dev.spaceships.spaceTravel.controller;


import dev.spaceships.spaceTravel.entity.SpaceShip;
import dev.spaceships.spaceTravel.service.SpaceShipServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.spaceships.spaceTravel.entity.SpaceShipGeneric;

import java.util.Optional;

@RestController
@RequestMapping("/api/spaceShip")
public class SpaceShipController {
    @Autowired
    private SpaceShipServiceImpl spaceShipServiceImpl;
    //Create new SpaceShip
    @PostMapping
    public ResponseEntity<?> create(@RequestBody SpaceShipGeneric s){
        return ResponseEntity.status(HttpStatus.CREATED).body(spaceShipServiceImpl.save(s));
    }
    //Return an SpaceShip
    @GetMapping("/{idSpaceShip}")
    public ResponseEntity<?> read(@PathVariable(value = "idSpaceShip") String id){
        Optional<SpaceShipGeneric> oSpaceShip = spaceShipServiceImpl.findById(id);

        if(!oSpaceShip.isPresent()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(oSpaceShip);
    }

    // Update SpaceShip
    @PutMapping("/{idSpaceShip}")
    public ResponseEntity<?> update(@RequestBody SpaceShipGeneric SpaceShipDetails, @PathVariable String idSpaceShip){
        Optional<SpaceShipGeneric> SpaceShip = spaceShipServiceImpl.findById(idSpaceShip);

        if(!SpaceShip.isPresent()){
            return ResponseEntity.notFound().build();
        }
        SpaceShip.get().setIdSpaceShip(SpaceShipDetails.getIdSpaceShip());
        SpaceShip.get().setCountries_idCountries(SpaceShipDetails.getCountries_idCountries());
        SpaceShip.get().setFuelType(SpaceShipDetails.getFuelType());
        SpaceShip.get().setYearCreation(SpaceShipDetails.getYearCreation());
        SpaceShip.get().setActive(SpaceShipDetails.getActive());
        SpaceShip.get().setPower(SpaceShipDetails.getPower());

        return ResponseEntity.status(HttpStatus.CREATED).body(spaceShipServiceImpl.save(SpaceShip.get()));
    }


    @DeleteMapping("/{idSpaceShip}")
    public ResponseEntity<?> delete(@PathVariable(value = "idSpaceShip") String id){
        if(spaceShipServiceImpl.findById(id).isPresent()){
            return ResponseEntity.notFound().build();
        }
        spaceShipServiceImpl.deleteById(id);
        return ResponseEntity.ok().build();
    }
}