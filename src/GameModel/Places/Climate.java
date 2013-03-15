package GameModel.Places;
import GameModel.Places.Climate;
import GameModel.Attribute;

/**
 * A Climate consists of a variety of attributes that describe the environment
 * 
 * @author James Nakano 
 * @version (a version number or a date)
 */
public class Climate
{
    // instance variables - replace the example below with your own
    private Attribute humidity;
    private Attribute sunlight;
    private Attribute rain;
    private Attribute wind;

    /**
     * Constructor for objects of class Weather
     */
    public Climate()
    {
        // initialise instance variables

    }

    /**
     * gets the sunlight
     * 
     * @return     the sum of x and y 
     */
    public int getSunlight()
    {
        // put your code here
        return sunlight.value;
    }
    
    /**
     * gets a summary of the climate
     * @return a summary of the climate 
     */
    public String getSummary()
    {
        // put your code here
        return humidity.status+sunlight.status+rain.status+wind.status;
    }
    
}
