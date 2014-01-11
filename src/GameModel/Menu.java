package GameModel;

import java.util.ArrayList; 
/**
 * A menu
 * 
 * @author James Nakano
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
