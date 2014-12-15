package GameModel;
import GameModel.Things.Items.Clothing.*;


/**
 * An outfit consists of pieces of clothing
 * 
 * @author James Nakano
 */
public class Outfit
{
    public Headwear headwear;
    public Accessory accessory;
    public Topwear top;
    public Bottomwear bottom;
    public Footwear shoes;

    /**
     * Constructor for objects of class Clothing
     */
    public Outfit()
    {

    }
    
    public Outfit(Headwear h, Accessory a, Topwear t, Bottomwear b, Footwear f)
    {
        headwear = h;
        accessory = a;
        top = t;
        bottom = b;
        shoes = f;
    }

    
}
