package GameModel.Materials;

import GameModel.Combinable;
import java.awt.Color;
import java.io.IOException;
/**
 * Skin is a type of material worn by animals
 * 
 * @author James Nakano
 */
public class Skin extends Material 
{
    
    public Color tone;

    /**
     * Constructor for objects of class Skin
     */
    public Skin()
    {
        flamability=5;
        hardness=3;
        conductivity=5;
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
