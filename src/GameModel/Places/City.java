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

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
