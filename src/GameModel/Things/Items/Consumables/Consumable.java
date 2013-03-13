package GameModel.Things.Items.Consumables;
import GameModel.Things.Items.Item;
import GameModel.Attribute;

/**
 * Write a description of class Consumable here.
 * 
 * @author James Nakano
 * @version (a version number or a date)
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
