package GameModel.Materials;


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
        name="Iron";
        conductivity.value=10;
        hardness.value=10;
        flexibility.value=7;
        water_resist.value=3;
        air_resist.value=4;
        earth_resist.value=7;
        durability.value=10;
    }
    
    public void update()
    {
        if(wet)
        durability.value--;
        if(temperature>=2800)
        flexibility.value=10;
        
    }
}
