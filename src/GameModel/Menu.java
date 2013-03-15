package GameModel;

import java.util.ArrayList; 
/**
 * A menu
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Menu
{
    private String title;
    private String description;
    private ArrayList<Menu> choices;
    private int selected;

    /**
     * Constructor for objects of class Menu
     */
    public Menu()
    {
        // initialise instance variables
        title="Main";
        selected=1;
    }

}
