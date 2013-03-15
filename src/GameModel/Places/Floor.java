package GameModel.Places;

import java.util.ArrayList; 
/**
 * A floor is a part of a building that contains rooms
 * 
 * @author James Nakano 
 * @version (a version number or a date)
 */
public class Floor extends Place
{
 
    private ArrayList<Place> rooms = subplaces;
    
    /**
     * Constructor for objects of class Floor
     */
    public Floor()
    {
        
    }

}
