
package GameModel.Materials;

/**
 *  A very malleable and conductive metal.Commonly used in electric devices.
 * @author James
 */
public class Copper extends Metal
{
    public Copper()
    {
        conductivity=9;
        malleability=9;
        density=7;
    }
    
    @Override
    public Material combine(Material other)
    {
        if(other.getClass().equals(Tin.class))
        return new Bronze();
        else
            return this;
    }
    
}
