package GameModel.Materials;

import GameModel.Combinable;
import java.io.IOException;


/**
 * A feather is a type of material.
 * 
 * @author James Nakano 
 * @version (a version number or a date)
 */
public class Feather extends Material
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Feather
     */
    public Feather()
    {
        // initialise instance variables
        x = 0;
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
