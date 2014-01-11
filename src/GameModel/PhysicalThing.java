package GameModel;
import GameModel.Things.Thing;

/**
 * A physical thing exists in a physical world.
 * It takes up space and has mass.
 * 
 * @author James 
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

    
}
