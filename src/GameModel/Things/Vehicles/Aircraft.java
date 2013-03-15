package GameModel.Things.Vehicles;

import GameModel.Things.Wheel;


/**
 * An aircraft is a vehicle that allows for air transportation and flight.
 * 
 * @author James Nakano 
 * @version (a version number or a date)
 */
public class Aircraft extends Vehicle
{
    private Wheel[] landing_wheels;

    /**
     * Constructor for objects of class Aircraft
     */
    public Aircraft()
    {
        // initialise instance variables
        landing_wheels=new Wheel[3];
    }

    
}
