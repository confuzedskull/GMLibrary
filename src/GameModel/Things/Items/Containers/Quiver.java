package GameModel.Things.Items.Containers;


/**
 * Write a description of class Quiver here.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Quiver extends Container
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Quiver
     */
    public Quiver()
    {

    }

    /**
     * Gets the arrowcount
     * 
     * @return     the number of arrows in quiver
     */
    public int getArrowCount()
    {
        // put your code here
        return contents.size();
    }
}
