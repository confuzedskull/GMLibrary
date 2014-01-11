package GameModel.Places;

import java.util.ArrayList; 
/**
 * A universe is the largest place possible. It contains worlds.
 * 
 * @author James Nakano
 */
public class Universe extends Place
{
    private ArrayList<Place> worlds = subplaces;
    private int size;

    /**
     * Constructor for objects of class Universe
     */
    public Universe()
    {
        
    }

    /**
     * Creates EVERYTHING
     * 
     */
    public void BigBang()
    {
        
        status="just created everything";
    }
}
