package GameModel.Things.Items;
import GameModel.Things.Thing;
import java.util.ArrayList; 
/**
 * Write a description of class Item here.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Item extends Thing
{
    public static ArrayList<Item> listOfAllItems;
    private int value,weight;
    public int bonus;
    private int permissions;//what can use this
    public boolean used;
    public int itemNumber;

    /**
     * Constructor for objects of class Item
     */
    public Item()
    {
        name="generic item";
        used=false;
        
    }
    
    
    public Item(String name)
    {
        this.name=name;
        itemNumber=listOfAllItems.size();
        listOfAllItems.add(this);
    }


    
}
