
package GameModel.Materials;

import GameModel.Combinable;

/**
 *  A strong, durable metal commonly used to make weapons and structures
 * @author James
 */
public class Steel extends Metal
{
    public Steel()
    {
        malleability=8;
        hardness=8;
        durability=8;
        
    }
    
    @Override
    public boolean combinesWith(Combinable other)
    {
        if(other.getClass().equals(Coal.class))
            return true;
        else return false;
    }
    
    @Override
    public Material combine(Material other)
    {
        if(other.getClass().equals(Coal.class))
            return new CarbonSteel();
        else
            return this;
    }
    
}
