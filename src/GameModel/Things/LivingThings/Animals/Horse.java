package GameModel.Things.LivingThings.Animals;
import GameModel.Things.LivingThings.BodyParts.*;

/**
 * A horse is a four-legged mammal that can be ridden by a human.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Horse extends Mammal
{
    // instance variables - replace the example below with your own
    private Leg[] legs;
    private Human rider;

    /**
     * Constructor for objects of class Horse
     */
    public Horse()
    {
        // initialise instance variables
        legs= new Leg[4];
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
        return 0;
    }
}
