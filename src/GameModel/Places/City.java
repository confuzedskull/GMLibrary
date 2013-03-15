package GameModel.Places;

import java.util.ArrayList; 
/**
 * A city is a place that contains buildings
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
