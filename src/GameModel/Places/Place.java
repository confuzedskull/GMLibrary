package GameModel.Places;
import GameModel.Things.Thing;
import GameModel.Attribute;
import java.util.ArrayList;
import java.awt.geom.Rectangle2D;
/**
 * A place contains things and has climate and terrain. It also may consist of subplaces.
 * 
 * @author James Nakano
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
     * Gets the status of the place
     * @return a description of current condition
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
     * @return  a list of inhabitants
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
     * Gets the population
     * @return  the number of inhabitants
     */
    public int getPopulation()
    {
        population.name="Population of"+name;
        population.value=getInhabitants().size();
        return population.value;
    }
    
    /**
     * gets a summary of the weather
     * @return  the summary of the climate
     */
    public String getWeather()
    {
        return climate.getSummary();
    }
    
    /**
     * gets the terrain of the area
     * @return  the terrain
     */
    public Terrain getTerrain()
    {
        return this.terrain;
    }

    
}
