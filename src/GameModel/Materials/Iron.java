
package GameModel.Materials;

import java.io.IOException;

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
    
    public boolean combinesWith(Metal other)
    {
        return true;
    
    }
    
        public Material combine(Material other)throws IOException
    {
        if(combinesWith(other))
        {
            if(other.getClass().equals(Coal.class))
                return new Steel();
            else
                return this;
        }
        else
        throw new IOException("These materials may not be combined");
    }
}
