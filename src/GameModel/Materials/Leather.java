
package GameModel.Materials;

import GameModel.Combinable;
import java.io.IOException;

/**
 * A tough material used for making light armor.
 * Can be obtained from horses;
 * It can be obtained from a horse
 * @author James
 */
public class Leather extends Material
{
    public Leather()
    {
        flamability=7;
        durability=7;
        hardness=4;
        density=6;
        
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
