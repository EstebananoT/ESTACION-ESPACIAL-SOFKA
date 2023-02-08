package dev.spaceships.spaceTravel.entity;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class NoCrew extends SpaceShipGeneric {
    public NoCrew(String idSpaceShip, String countries_idCountries, String fuelType, String yearCreation, Boolean isActive, int power) {
        super(idSpaceShip, countries_idCountries, fuelType, yearCreation, isActive, power);
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
                    System.out.println("Ok it's gone");
                    scheduler.shutdown();
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
    }

    @Override
    public void starEngine() {
        super.starEngine();
    }

    @Override
    public void emergenciExit() {
        System.out.println("Critical damage! There are no crew members on the ship. ");
    }
}
