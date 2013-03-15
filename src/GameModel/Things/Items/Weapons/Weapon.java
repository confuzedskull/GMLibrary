package GameModel.Things.Items.Weapons;
import GameModel.Things.Items.Item;
import GameModel.Attribute;


/**
 * A tool made for combat
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Weapon extends Item
{
    private Attribute physical_damage;
    private Attribute magic_damage;
    public Attribute range;
    public Attribute accuracy;

    /**
     * Constructor for objects of class Weapon
     */
    public Weapon()
    {
        category="Item";
    }

}
