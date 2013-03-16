package GameModel.Materials;

import GameModel.Attribute;


/**
 * Metal is a hard material that is conductive and durable.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Metal extends Material
{
    
    /**
     * Constructor for objects of class Metal
     */
    public Metal()
    {
        name="Metal";
        description="Some kind of metal";
        conductivity=10;
        hardness=10;
        flexibility=7;
        water_resist=3;
        air_resist=4;
        earth_resist=7;
        durability=10;
    }
    
    public void update()
    {
        if(wet)
        durability--;
        if(temperature>=2800)
        flexibility=10;
        
    }
}
