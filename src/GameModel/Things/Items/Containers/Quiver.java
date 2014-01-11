package GameModel.Things.Items.Containers;


/**
 * A quiver is a container that stores arrows
 * 
 * @author James Nakano
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
