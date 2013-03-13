package GameModel.Things.Items.Clothing;


/**
 * Write a description of class Shoes here.
 * 
 * @author James Nakano 
 * @version (a version number or a date)
 */
public class Shoe extends Footwear
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Shoes
     */
    public Shoe()
    {
        // initialise instance variables
        x = 0;
        category="Footwear";
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
