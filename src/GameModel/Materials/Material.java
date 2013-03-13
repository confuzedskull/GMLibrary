package GameModel.Materials;
import GameModel.Attribute;

/**
 * Write a description of class Material here.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Material
{
    public Attribute durability;
    public Attribute hardness;
    public Attribute flexibility;
    public Attribute conductivity;
    public Attribute water_resist;
    public Attribute fire_resist;
    public Attribute air_resist;
    public Attribute earth_resist;
    public boolean wet;
    public String name;
    public double temperature;

    /**
     * Constructor for objects of class Material
     */
    public Material()
    {
        wet=false;

    }

}
