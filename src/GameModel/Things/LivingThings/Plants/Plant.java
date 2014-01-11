package GameModel.Things.LivingThings.Plants;

import GameModel.Attribute;
import GameModel.Things.LivingThings.LivingThing;


/**
 * A plant is a living thing that gets nutrients from the environment
 * It typically is incapable of movement.
 * 
 * @author James Nakano
 */
public class Plant extends LivingThing
{
    private Attribute CO2;
    private Attribute sunlight;

    /**
     * Constructor for objects of class Plant
     */
    public Plant()
    {

    }

    /**
     * The plant takes in sunlight
     * 
     */
    public void getSun()
    {
        this.sunlight.value+=this.home.climate.getSunlight();
    }
}
