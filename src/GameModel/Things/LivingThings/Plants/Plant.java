package GameModel.Things.LivingThings.Plants;

import GameModel.Attribute;
import GameModel.Things.LivingThings.LivingThing;


/**
 * Write a description of class Plant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
