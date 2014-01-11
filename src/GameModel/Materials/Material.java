package GameModel.Materials;

import GameModel.Attribute;
import GameModel.Combinable;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Material is used to create things. It can be combined with other material to
 * create something new.
 *
 * @author James Nakano
 */
public abstract class Material implements Combinable
{
    public int hardness;
    public int density;
    public int durability;
    public int conductivity;
    public int flamability;
    public Color color;
    public ArrayList<Attribute> attributes;
    public boolean wet;
    public boolean combinable;
    public int temperature;
    public int weight;
    

    /**
     * Constructor for objects of class Material
     */
    public Material()
    {
        combinable = true;
        wet=false;
    }

    /**
     * Checks to see if this material may be combined with the specified
     * material
     *
     * @param other the material to be combined with
     * @return true if the materials may be combined
     */
    public boolean combinesWith(Material other)
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
     * Inherits all attributes of the given material. Any duplicates combine
     * their values
     *
     * @param other the material to inherit attributes from
     */
    public void inheritAttributes(Material other)
    {
        for (int i = 0; i < other.attributes.size(); i++)
        {
            inheritAttribute(other.attributes.get(i));
        }

    }

    /**
     * Combines this material with another material
     *
     * @param other the material to be combined with
     */
    public Material combine(Material other) throws IOException
    {
        if (combinesWith(other))
        {
            inheritAttributes(other);
            return this;
        } else
        {
            throw new IOException("These materials may not be combined");
        }
    }
}
