package GameModel.Things.Vehicles;
import GameModel.Things.Items.Item;
import GameModel.Attribute;

/**
 * A vehicle is a machine used for transportation
 * 
 * @author James Nakano 
 * @version (a version number or a date)
 */
public class Vehicle extends Item
{
    private Attribute speed;
    private int max_load;
    private int fuel;
    private int mpg;

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle()
    {
        fuel=0;
    }


}
