package GameModel.Things.Items;
import GameModel.Attribute;
import GameModel.Things.Thing;
import java.io.IOException;
import java.util.ArrayList; 
/**
 * An item is a thing that has value and use
 * 
 * @author James Nakano
 */
public class Item extends Thing
{
    public static ArrayList<Item> listOfAllItems;
    private int value,weight;
    public int bonus;
    private int permissions;//what can use this
    public boolean used;
    public int itemNumber;
    public ArrayList<Attribute> attributes;
    public boolean combinable;

    /**
     * Constructor for objects of class Item
     */
    public Item()
    {
        name="generic item";
        used=false;
        combinable=true;
        
    }
    
    
    public Item(String name)
    {
        this.name=name;
        itemNumber=listOfAllItems.size();
        listOfAllItems.add(this);
    }
    
    /**
     * Checks to see if this item may be combined with the specified
     * item
     *
     * @param other the item to be combined with
     * @return true if the items may be combined
     */
    public boolean combinesWith(Item other)
    {
        if (combinable)
        {
            return true;
        } else
        {
            return false;
        }
    }

    /**
     * Inherits the given attribute. If already inherited, then the attribute
     * values are combined
     *
     * @param a the attribute to inherit
     */
    public void inheritAttribute(Attribute a)
    {
        for (int i = 0; i < attributes.size(); i++)
        {
            if (attributes.get(i).equals(a))
            {
                if (attributes.get(i).value + a.value < attributes.get(i).getMax())
                {
                    attributes.get(i).value += a.value;
                } else
                {
                    attributes.get(i).value = attributes.get(i).getMax();
                }
            } else
            {
                attributes.add(a);
            }
        }
    }

    /**
     * Inherits all attributes of the given item. Any duplicates combine
     * their values
     *
     * @param other the item to inherit attributes from
     */
    public void inheritAttributes(Item other)
    {
        for (int i = 0; i < other.attributes.size(); i++)
        {
            inheritAttribute(other.attributes.get(i));
        }

    }

    /**
     * Combines this item with another item
     *
     * @param other the item to be combined with
     */
    public void combine(Item other) throws IOException
    {
        if (combinesWith(other))
        {
            inheritAttributes(other);
        } else
        {
            throw new IOException("These items may not be combined");
        }
    }


    
}
