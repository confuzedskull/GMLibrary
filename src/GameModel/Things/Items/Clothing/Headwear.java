package GameModel.Things.Items.Clothing;


/**
 * Headwear is clothing that is worn on the head.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Headwear extends Clothing
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Headwear
     */
    public Headwear()
    {
        // initialise instance variables
        x = 0;
        category="Clothing";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
