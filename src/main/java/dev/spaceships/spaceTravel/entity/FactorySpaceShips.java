package dev.spaceships.spaceTravel.entity;

public class FactorySpaceShips {
    public SpaceShipGeneric getShip(String shapaceShipType,String idSpaceShip, String countries_idCountries, String fuelType, String yearCreation, Boolean isActive, int power){
        if(shapaceShipType == null){
            return null;
        }
        if(shapaceShipType.equalsIgnoreCase("CREW")){
            return new Crew(idSpaceShip,countries_idCountries,fuelType,yearCreation,isActive,power);

        } else if(shapaceShipType.equalsIgnoreCase("NOCREW")){
            return new NoCrew(idSpaceShip,countries_idCountries,fuelType,yearCreation,isActive,power);

        } else if(shapaceShipType.equalsIgnoreCase("SHUTTLE")){
            return new Shuttle(idSpaceShip,countries_idCountries,fuelType,yearCreation,isActive,power);
        }

        return null;
    }
}
