package GameModel.Things.Items.Consumables;
import GameModel.Things.Items.Item;
import GameModel.Attribute;

/**
 * An item that can be consumed to improve stats
 * 
 * @author James Nakano
 */
public class Consumable extends Item
{
    private Flavor flavor;
    private boolean consumed;
    private Attribute health_bonus;
    private int temperature;
    private boolean perishable;

    /**
     * Constructor for objects of class Consumable
     */
    public Consumable()
    {
        itemNumber=1;
        consumed=false;
    }
    
    public int getTemperature()
    {
        return temperature;
    }

}
