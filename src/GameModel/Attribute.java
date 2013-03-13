package GameModel;


/**
 * An attribute stores a value that has limits. Its value can be evaluated in relation to its limits.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Attribute
{
    // instance variables - replace the example below with your own
    public int value;
    public String name;
    public String status;
    public String description;
    private int max,min;
    public static int globalMax,globalMin;
    

    /**
     * Constructor for objects of class Status
     */
    public Attribute()
    {
        name="generic attribute";
        status="initialized";
        min=0;
        max=100;
        
    }

    /**
     * Gets the current status of the attribute based on percentage
     * @return     the status
     */
    public String getStatus()
    {
        if(value==max)
        status="max";
        if(value>max*(3/4) && value<max)//75%-100%
        status="high";
        if(value<max*(3/4) && value>max/2)//50%-75%
        status="moderate";
        if(value<max/2 && value>max/4)//25%-50%
        status="low";
        if(value<max/4 && value>min)//0-25%
        status="extremely low";
        
        return status;
    }
    
    /**
     * Sets the max and min
     * @param  minumum, maximum  the minimum and maximum values to set  
     */
    public void setLimits(int minimum, int maximum)
    {
        min=minimum;
        max=maximum;
    }
}
