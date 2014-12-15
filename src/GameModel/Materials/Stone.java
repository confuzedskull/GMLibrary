package GameModel.Materials;

import GameModel.Combinable;
import java.io.IOException;

/**
 * A hard material used for building
 *
 * @author James
 */
public class Stone extends Material
{

    public Stone()
    {
        durability=7;
        hardness=7;
        density=8;
        flamability=0;
        conductivity=0;
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
