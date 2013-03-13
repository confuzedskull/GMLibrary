package GameModel.Places;
import GameModel.Things.Thing;
import GameModel.Attribute;
import java.util.ArrayList;
import java.awt.geom.Rectangle2D;
/**
 * A place contains things and has climate and terrain. It also may consist of subplaces.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Place extends Thing
{
    private Attribute population;
    private ArrayList<Thing> inhabitants = new ArrayList<Thing>();
    public ArrayList<Place> subplaces = new ArrayList<Place>();
    public Climate climate;
    private Terrain terrain;
    private Rectangle2D.Double boundaries;
    public double gravity;

    /**
     * Constructor for objects of class Place
     */
    public Place()
    {
        name="Place";
        status="deserted";
        description="The middle of nowhere.";

    }
    /**
     * An example of a method - replace this comment with your own
     * @return     the sum of x and y 
     */
    public String getStatus()
    {
        if(population.value==0)
            status="deserted";
        if(population.getStatus().equals("high"))
            status="crowded";
        return status;

    }

    /**
     * gets all inhabitants in this place and its subplaces
     * @return     the sum of x and y 
     */
    public ArrayList<Thing> getInhabitants()
    {
        for(int subplace=0; subplace<subplaces.size();subplace++)
        {
            inhabitants.addAll(subplaces.get(subplace).inhabitants);
        }
        return inhabitants;

    }

    /**
     * An example of a method - replace this comment with your own
     * @return     the sum of x and y 
     */
    public int getPopulation()
    {
        population.name="Population of"+name;
        population.value=getInhabitants().size();
        return population.value;
    }
    
    /**
     * gets a summary of the weather
     * @return     a summary of the current area climate
     */
    public String getWeather()
    {
        return climate.getSummary();
    }
    
    /**
     * gets the terrain of the area
     * @return     the sum of x and y 
     */
    public Terrain getTerrain()
    {
        return this.terrain;
    }

    
}
