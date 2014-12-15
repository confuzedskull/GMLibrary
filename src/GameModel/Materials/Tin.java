
package GameModel.Materials;

/**
 * a silvery,malleable metal. Used in food packaging.
 * @author James
 */
public class Tin extends Metal
{
    public Tin()
    {
        malleability=8;
        density=4;
        hardness=7;
        durability=6;
    }
    
    @Override
    public Material combine(Material other)
    {
        if(other.getClass().equals(Copper.class))
        return new Bronze();
        else
            return this;
    }
}
