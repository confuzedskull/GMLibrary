package GameModel.Things.Items.Consumables;


/**
 * Food is a Consumable that may be eaten
 * 
 * @author James Nakano 
 */
public class Food extends Consumable
{
    private int freshness;
    private int age; //hours
    private boolean cooked;
    /**
     * Constructor for objects of class Food
     */
    public Food()
    {
        // initialise instance variables
        name="Chicken";
        category="Food";
        cooked=true;
        freshness=10;
    }
    
    /**
     * Checks the conditions of the food and updates the freshness
     */
    public void spoil()
    {
        if(!cooked && getTemperature()>40 && age>5)
        freshness --;
        if(!cooked && getTemperature()>40 && age>10)
        freshness -=2;
    }
    
    public String getCondition()
    {
        return "fresh";
    }
    
    public void update()
    {
        spoil();
    }    
}
