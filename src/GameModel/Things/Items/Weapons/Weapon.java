package GameModel.Things.Items.Weapons;
import GameModel.Materials.Material;
import GameModel.Things.Items.Item;


/**
 * A tool made for combat
 * 
 * @author James Nakano
 */
public class Weapon extends Item
{
    private int damage;
    private int range;
    private int accuracy;
    private Material material;

    /**
     * Constructor for objects of class Weapon
     */
    public Weapon()
    {
        name="Generic Weapon";
        range=1;
        category="Item";
    }

}
