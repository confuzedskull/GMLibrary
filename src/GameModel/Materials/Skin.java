package GameModel.Materials;

import java.awt.Color;
/**
 * Skin is a type of material worn by animals
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Skin extends Material 
{
    // instance variables - replace the example below with your own
    private int x;
    private Color tone;

    /**
     * Constructor for objects of class Skin
     */
    public Skin()
    {
        // initialise instance variables
        x = 0;
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
