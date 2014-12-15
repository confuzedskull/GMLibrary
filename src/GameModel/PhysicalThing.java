package GameModel;
import GameModel.Things.Thing;
import GameModel.Materials.Material;
/**
 * A physical thing exists in a physical world.
 * It takes up space and has mass.
 * 
 * @author James 
 */
public class PhysicalThing extends Thing 
{
    private int x,y,z;
    private int volume;
    private int mass;
    private Material composition;

    /**
     * Constructor for objects of class PhysicalThing
     */
    public PhysicalThing()
    {

    }

    
}
