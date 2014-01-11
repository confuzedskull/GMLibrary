package GameModel.Things.LivingThings.Animals;
import GameModel.Things.LivingThings.BodyParts.*;

/**
 * A horse is a four-legged mammal that can be ridden by a human.
 * 
 * @author James Nakano
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

    
}
