package GameModel.Things.LivingThings.Animals;
import GameModel.Things.LivingThings.BodyParts.*;

/**
 * Humans are complex mammals capable of thought 
 * 
 * @author James Nakano 
 * @version (a version number or a date)
 */
public class Human extends Mammal
{
    // instance variables - replace the example below with your own
    private Arm[] arms;
    private Leg[] legs;

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        arms= new Arm[2];
        legs= new Leg[2];
    }


}
