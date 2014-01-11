package GameModel.Places;

import java.util.ArrayList; 
/**
 * A country is a place that contains Cities
 * 
 * @author James Nakano 
 */
public class Country extends Place
{
    private ArrayList<Place> cities = subplaces;
    /**
     * Constructor for objects of class Country
     */
    public Country()
    {
       
    }


}
