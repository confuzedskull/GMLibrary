package GameModel.Places;

import java.util.ArrayList; 
/**
 * Write a description of class City here.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class City extends Place
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList<Building> buildings = new ArrayList<Building>();

    /**
     * Constructor for objects of class City
     */
    public City()
    {
        // initialise instance variables
        x = 0;
    }

}
