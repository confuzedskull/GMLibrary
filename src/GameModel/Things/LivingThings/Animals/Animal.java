package GameModel.Things.LivingThings.Animals;
import GameModel.Things.LivingThings.LivingThing;
import GameModel.Things.LivingThings.Body;
import java.util.ArrayList; 
/**
 * Animals are complex living things.
 * 
 * @author James Nakano
 */
public class Animal extends LivingThing
{
    private Body body;
    private double height,weight,mass;
   
    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        name="Generic Animal";
        status="born";

    }
    
    /**
     * Gets the weight of the animal based on the gravity of the world
     * @return the weight
     */
    public double getWeight()
    {
        return mass*home.gravity;
    }
    
    /**
     * Gets the height of the animal
     */
    public double getHeight()
    {
        return height;
    }
    


}
