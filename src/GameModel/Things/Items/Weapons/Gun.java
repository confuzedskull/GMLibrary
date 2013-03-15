package GameModel.Things.Items.Weapons;


/**
 * A ranged weapon that fires bullets
 * 
 * @author James Nakano 
 * @version (a version number or a date)
 */
public class Gun extends RangedWeapon
{
    private int capacity;

    /**
     * Constructor for objects of class Gun
     */
    public Gun()
    {
        name="Pistol";
        category="Projectile";

    }

    /**
     * Reloads the weapon
     */
    public void reload()
    {
        
    }
}
