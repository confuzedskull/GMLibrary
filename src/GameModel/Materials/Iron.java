
package GameModel.Materials;

/**
 * A common metal used for making a wide range of things
 * @author James
 */
public class Iron extends Metal
{
    public Iron()
    {
        malleability=8;
        
    }
    
    public boolean combinesWith(Material other)
    {
        if(other.getClass().equals(Coal.class))
        {
            return true;
        }
        else
            return false;
    }
    
    
}
