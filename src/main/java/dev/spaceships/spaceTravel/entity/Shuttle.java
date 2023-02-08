package dev.spaceships.spaceTravel.entity;

public class Shuttle extends SpaceShipGeneric {
    public Shuttle(String idSpaceShip, String countries_idCountries, String fuelType, String yearCreation, Boolean isActive, int power) {
        super(idSpaceShip, countries_idCountries, fuelType, yearCreation, isActive, power);
    }

    @Override
    public void launch() {
        super.launch();
    }

    @Override
    public void starEngine() {
        super.starEngine();
    }

    @Override
    public void emergenciExit() {
        super.emergenciExit();
    }
}
