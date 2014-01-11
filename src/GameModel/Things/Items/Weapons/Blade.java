package GameModel.Things.Items.Weapons;
import GameModel.Things.Items.Item;

/**
 * A weapon that is sharp
 * 
 * @author (your name) 
 */
public class Blade extends Weapon
{
    private int length;
    private int sharpness;

    /**
     * Constructor for objects of class Blade
     */
    public Blade()
    {
        name="Sharp Thing";
        category="Weapon";

    }

    /**
     * Sharpens the blade
     * 
     * @param  whetstone  item to be used for sharpening
     */
    public void sharpen(Item whetstone)
    {
        sharpness+=whetstone.bonus;
    }
}
