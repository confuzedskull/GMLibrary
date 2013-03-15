package GameModel.Places;

import java.util.ArrayList; 
/**
 * A world a place where things live and exist
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class World extends Place
{
    private ArrayList<Place> countries = subplaces;
    /**
     * Constructor for objects of class World
     */
    public World()
    {
        name="unnamed world";
    }
}
