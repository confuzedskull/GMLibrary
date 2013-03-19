package GameModel.Materials;

import GameModel.Attribute;
import GameModel.Combinable;
import java.io.IOException;


/**
 * Metal is a hard material that is conductive and durable.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Metal extends Material
{
    public int malleability;
    private int melting_point;
    /**
     * Constructor for objects of class Metal
     */
    public Metal()
    {
        flamability=1;
        density=8;
        durability=10;
        conductivity=10;
        hardness=8;
    }
    
    public void update()
    {
        if(wet)
        {
            durability--;
        }
        if(temperature>=2800)
        malleability=10;
        
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
