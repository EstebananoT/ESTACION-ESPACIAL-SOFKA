package dev.spaceships.spaceTravel.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

@Entity
@Table(name = "spaceships")
public class SpaceShipGeneric implements SpaceShip {

    @Id
    private String idSpaceShip;
    @Column
    private String countries_idCountries;
    @Column
    private String fuelType;
    @Column
    private Date yearCreation;
    @Column
    private Boolean isActive;
    @Column
    private int power;

    public SpaceShipGeneric(){}
    public SpaceShipGeneric(String idSpaceShip, String countries_idCountries, String fuelType, String yearCreation, Boolean isActive, int power) {
        this.idSpaceShip = idSpaceShip;
        this.countries_idCountries = countries_idCountries;
        this.fuelType = fuelType;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.yearCreation = null;
        try {
            this.yearCreation = sdf.parse(yearCreation);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.isActive = isActive;
        this.power = power;
    }

    @Override
    public void launch() {
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        final Runnable runnable = new Runnable() {
            int countdownStarter = 5;

            public void run() {

                System.out.println(countdownStarter);
                countdownStarter--;

                if (countdownStarter < 0) {
                    System.out.println("Takeoff!! Bye Bye See You Soon: "+ getIdSpaceShip());
                    System.out.println("We will miss you!");
                    scheduler.shutdown();
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
    }

    @Override
    public void starEngine() {
        System.out.println("The machine: " +getIdSpaceShip()+" is ready for takeoff!");
    }

    @Override
    public void emergenciExit() {
        System.out.println(getIdSpaceShip()+" => Machine evacuation alert!!!");
        System.out.println("Damage critical!!!");
    }


    public String getIdSpaceShip() {
        return idSpaceShip;
    }

    public void setIdSpaceShip(String idSpaceShip) {
        this.idSpaceShip = idSpaceShip;
    }

    public String getCountries_idCountries() {
        return countries_idCountries;
    }

    public void setCountries_idCountries(String countries_idCountries) {
        this.countries_idCountries = countries_idCountries;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Date getYearCreation() {
        return yearCreation;
    }

    public void setYearCreation(Date yearCreation) {
        this.yearCreation = yearCreation;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
