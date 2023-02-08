package dev.spaceships.spaceTravel;

import dev.spaceships.spaceTravel.controller.SpaceShipController;
import dev.spaceships.spaceTravel.entity.FactorySpaceShips;
import dev.spaceships.spaceTravel.entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class SpaceTravelApplication {

	public static void main(String[] args) {
		//Run API
		SpringApplication.run(SpaceTravelApplication.class, args);
	}

}
