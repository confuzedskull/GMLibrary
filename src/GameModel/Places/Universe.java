package GameModel.Places;

import java.util.ArrayList; 
/**
 * Write a description of class Universe here.
 * 
 * @author James Nakano
 * @version (a version number or a date)
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
