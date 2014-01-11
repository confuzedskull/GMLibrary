package GameModel.Things.Items.Consumables;


/**
 * Consists of a number of tastes that are attributed to food
 * 
 * @author James Nakano
 */
public class Flavor
{
    public int bitterness;
    public int sweetness;
    public int sourness;
    public int spicyness;
    public int saltiness;
 
    /**
     * Constructor for objects of class Flavor
     */
    public Flavor()
    {
        bitterness=10;
        sweetness=5;
        sourness=4;
        spicyness=4;

    }

    /**
     * Gets the strongest flavor
     * 
     * @return     the strongest flavor
     */
    public String getStrongest()
    {
        String strongestFlavor="";
        if(bitterness > sweetness
        && bitterness > sourness
        && bitterness > spicyness
        && bitterness > saltiness
        )
        strongestFlavor="bitter";
        
        if(sweetness > bitterness
        && sweetness > sourness
        && sweetness > spicyness
        && sweetness > saltiness
        )
        strongestFlavor="sweet";
        
        if(sourness > bitterness
        && sourness > sweetness
        && sourness > spicyness
        && sourness > saltiness
        )
        strongestFlavor="sour";
        
        if(spicyness > bitterness
        && spicyness > sourness
        && spicyness > sweetness
        && spicyness > saltiness
        )
        strongestFlavor="spicy";
        
        if(saltiness > bitterness
        && saltiness > sourness
        && saltiness > sweetness
        )
        strongestFlavor="salty";
        
        return strongestFlavor;
    }
}
