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
    private String status;
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
        value=50;
        
    }
    
    public Attribute(String name)
    {
        this.name=name;
        status="initialized";
        min=0;
        max=100;
        value=50;
        
    }
    
    public Attribute(String name, int value)
    {
        this.name=name;
        status="initialized";
        min=0;
        max=100;
        this.value=value;
        
    }
    /**
     * Sets the status
     * @param status a string that contains the new status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    

    /**
     * Gets the current status of the attribute based on percentage
     * @return  an evaluation of the status based on relative value
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
     * Gets the maximum value
     * @return an integer representing the maximum value
     */
    public int getMax() {
        return max;
    }
    
    /**
     * Sets the maximum value
     * @param max the new maximum value
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * Gets the minimum value
     * @return the minimum value
     */
    public int getMin() {
        return min;
    }

    /**
     * Sets the minimum value
     * @param min the new minimum value
     */
    public void setMin(int min) {
        this.min = min;
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
