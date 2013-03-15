package GameModel.Things.Vehicles;
import GameModel.Things.Wheel;


/**
 * Write a description of class Car here.
 * 
 * @author James Nakano 
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private Wheel[] wheels;

    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        // initialise instance variables
        wheels=new Wheel[4];
    }

    
}
