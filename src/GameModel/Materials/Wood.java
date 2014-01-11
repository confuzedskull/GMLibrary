package GameModel.Materials;

import GameModel.Attribute;
import GameModel.Combinable;
import java.io.IOException;


/**
 * Wood is strong but flammable
 * 
 * @author James Nakano
 */
public class Wood extends Material
{
    
    /**
     * Constructor for objects of class Wood
     */
    public Wood()
    {
        flamability=8;
        hardness=7;
        conductivity=7;
        density=7;
        durability=7;
    }

    @Override
    public boolean combinesWith(Combinable other)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void combine(Combinable other) throws IOException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
