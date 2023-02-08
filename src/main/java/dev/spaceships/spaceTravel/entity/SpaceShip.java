package dev.spaceships.spaceTravel.entity;

public interface SpaceShip {
    //Start the launch, a countdown :D
    void launch();
    //Starts the ships starter motor.
    void starEngine();
    //This method specifies what ships do when requesting an emergency exit.
    void emergenciExit();
}
