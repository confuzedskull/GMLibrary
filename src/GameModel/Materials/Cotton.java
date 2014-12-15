
package GameModel.Materials;

import GameModel.Combinable;
import java.io.IOException;

/**
 * A soft, fluffy material used for making clothing
 * @author James
 */
public class Cotton extends Material
{
    public Cotton()
            {
                density=1;
                hardness=1;
                flamability=10;
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
