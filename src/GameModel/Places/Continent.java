package GameModel.Places;

import java.util.ArrayList; 
/**
 * A continent is a place that contains countries
 * 
 * @author (your name) 
 */
public class Continent extends Place
{
    
    private ArrayList<Place> countries = subplaces;
    /**
     * Constructor for objects of class Continent
     */
    public Continent()
    {
        
    }

    
}
