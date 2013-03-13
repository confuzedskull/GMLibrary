package GameModel.Things.Items;


/**
 * Write a description of class Ammo here.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Ammo extends Item
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Ammo
     */
    public Ammo()
    {
        // initialise instance variables
        x = 0;
        category="Ammunition";
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
