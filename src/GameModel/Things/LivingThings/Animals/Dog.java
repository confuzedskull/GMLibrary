package GameModel.Things.LivingThings.Animals;
import GameModel.Things.LivingThings.BodyParts.*;

/**
 * An four-legged mammal from the canine species
 * 
 * @author James Nakano 
 * @version (a version number or a date)
 */
public class Dog extends Mammal
{
    // instance variables - replace the example below with your own
    private Leg[] legs;
    private BodyPart tail;

    /**
     * Constructor for objects of class Dog
     */
    public Dog()
    {
        // initialise instance variables
        legs= new Leg[4];
        
    }

}
