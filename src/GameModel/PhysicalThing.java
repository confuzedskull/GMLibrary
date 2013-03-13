package GameModel;
import GameModel.Things.Thing;

/**
 * Write a description of class PhysicalThing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhysicalThing extends Thing 
{
    // instance variables - replace the example below with your own
    private int x,y,z;
    private int volume;
    private int mass;

    /**
     * Constructor for objects of class PhysicalThing
     */
    public PhysicalThing()
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
