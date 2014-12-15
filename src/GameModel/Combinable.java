
package GameModel;

import java.io.IOException;

/**
 * Things that may be combined with other things
 * @author James
 */
public interface Combinable
{
    /**
     * Checks to see if this thing may be combined with another thing
     *
     * @param other the thing to be combined with
     * @return true if the thing may be combined
     */
    public boolean combinesWith(Combinable other);
    
    /**
     * Combines this thing with another thing
     *
     * @param other the thing to be combined with
     */
    public void combine(Combinable other) throws IOException;
    
}
