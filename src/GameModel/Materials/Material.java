package GameModel.Materials;
import GameModel.Attribute;
import java.io.IOException;
import java.util.ArrayList;

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
    public ArrayList<Attribute> attributes;
    public boolean wet;
    public boolean combinable;
    public String name;
    public String description;
    public double temperature;

    /**
     * Constructor for objects of class Material
     */
    public Material()
    {
        name="new material";
        description="an unknown material";
        combinable=true;
    }
    /**
     * Checks to see if this material may be combined with the specified material
     * @param other the material to be combined with
     * @return true if the materials may be combined
     */
    public boolean combinesWith(Material other)
    {
        return true;
    }
    
    /**
     * Combines this material with another material
     * @param other the material to be combined with
     */
    public void combine(Material other) throws IOException
    {
        if(combinesWith(other))
        {
        durability.value+=other.durability.value;
        hardness.value+=other.durability.value;
        flexibility.value+=other.flexibility.value;
        conductivity.value+=other.conductivity.value;
        water_resist.value+=other.water_resist.value;
        fire_resist.value+=other.fire_resist.value;
        air_resist.value+=other.air_resist.value;
        earth_resist.value+=other.air_resist.value;
        }
        else
            throw new IOException("These materials may not be combined");
    }

}
