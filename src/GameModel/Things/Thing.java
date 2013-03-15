package GameModel.Things;

import java.awt.geom.Point2D;
import java.util.ArrayList; 
/**
 * A Thing is an object that has a name,number, status, and description
 * 
 * @author James Nakano 
 * @version 11/17/2012
 */
public class Thing
{
    // instance variables - replace the example below with your own
    private Point2D current,center;
    public String name,status,category,description;
    private static ArrayList<Thing> listOfObjects = new ArrayList<Thing>();
    public int number;
    /**
     * Constructor for objects of class BasicObject
     */
    public Thing()
    {
        
        this.name="Thing";
        status="created";
        listOfObjects.add(this);
    }

    
    /**
     * An example of a method - replace this comment with your own
     * @return  allObjects A list of all the objects in the class
     */
    public static ArrayList<Thing> getAllObjects()
    {
        return listOfObjects;
    }
    
    /**
     * destroys everything
     */
    public static void destroyAll()
    {
        for(int i=0; i<listOfObjects.size(); i++)
        {
            listOfObjects.remove(i);
        } 
    }
    
    /**
     * removes the object from the list
     */
    public void destroy()
    {        
        listOfObjects.remove(this.number);
    }
    
    /**
     * updates the object
     */
    public void update()
    {        
        
    }
   
}
