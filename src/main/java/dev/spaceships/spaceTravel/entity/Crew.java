package dev.spaceships.spaceTravel.entity;

public class Crew extends SpaceShipGeneric {
    public Crew(String idSpaceShip, String countries_idCountries, String fuelType, String yearCreation, Boolean isActive, int power) {
        super(idSpaceShip, countries_idCountries, fuelType, yearCreation, isActive, power);
    }

    @Override
    public void launch() {
        super.launch();
    }

    @Override
    public void starEngine() {
        System.out.println("RATATATATATATATATATATA.");
        System.out.println("*A lot of fuell is gone* D:<.");
    }

    @Override
    public void emergenciExit() {
        System.out.println("All passengers have been successfully ejected in a capsule.");
    }
}
