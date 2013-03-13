package GameModel.Places;

import java.util.ArrayList; 
/**
 * Write a description of class World here.
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
