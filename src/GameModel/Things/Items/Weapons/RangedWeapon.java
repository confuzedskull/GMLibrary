package GameModel.Things.Items.Weapons;
import GameModel.Things.Items.Ammo;

import java.util.ArrayList; 
/**
 * Write a description of class RangedWeapon here.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class RangedWeapon extends Weapon
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList<Ammo> ammunition = new ArrayList<Ammo>();

    /**
     * Constructor for objects of class Projectile
     */
    public RangedWeapon()
    {
        category="Weapon";
        
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
