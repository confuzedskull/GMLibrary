package GameModel.Things.LivingThings.Animals;
import GameModel.Things.LivingThings.BodyParts.*;

/**
 * Write a description of class Dog here.
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
