package GameModel.Materials;

import GameModel.Combinable;
import java.awt.Color;
import java.io.IOException;

/**
 * A black,brittle material used for making fire. 
 * @author James
 */
public class Coal extends Material
{

    public Coal()
    {
        durability=4;
        flamability=9;
        hardness=5;
        density=4;
        conductivity=4;
        color=Color.BLACK;
    }

   
    @Override
    public boolean combinesWith(Combinable other)
    {
        if(other.getClass().equals(Iron.class))
            return true;
        else if(other.getClass().equals(Steel.class))
            return true;
        else return false;
    }

    
    @Override
    public Material combine(Material other)
    { 
        if(other.getClass().equals(Iron.class))
            return new Steel();
        else if(other.getClass().equals(Steel.class))
            return new CarbonSteel();
        else return this;
    }

    @Override
    public void combine(Combinable other) throws IOException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
