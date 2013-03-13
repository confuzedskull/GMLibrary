package GameModel.People;
import GameModel.Attack;
import GameModel.Attribute;
import GameModel.Outfit;
import GameModel.Quest;
import GameModel.Things.Thing;
import GameModel.Things.LivingThings.*;
import GameModel.Things.LivingThings.BodyParts.BodyPart;
import GameModel.Things.Items.*;
import GameModel.Things.Items.Weapons.*;
import GameModel.Things.Items.Clothing.*;
import GameModel.Things.Items.Containers.Container;
import java.util.ArrayList; 
/**
 * Models a generic RPG character
 * 
 * @author James Nakano 
 * @version (a version number or a date)
 */
public class RPGCharacter extends Character
{
    private Container inventory;
    private int inventory_max;
    private Item primary,secondary;
    private Outfit armor;
    private int money;
    private Attribute incumberance;
    private static ArrayList<Quest> quests = new ArrayList<Quest>();

    /**
     * Constructor for objects of class RPGCharacter
     */
    public RPGCharacter()
    {
        name="Hero";
        money=0;

    }

    /**
     * Equips headwear
     * 
     * @param  headpiece headwear to equip
     */
    public void equip(Helmet headpiece)
    {
        inventory.remove(headpiece);
        inventory.add(armor.headwear);
        armor.headwear=headpiece;

    }

    /**
     * Equips primary weapon
     * 
     * @param  weapon1 weapon to equip as primary
     */
    public void equipPrimary(Weapon weapon1)
    {

        inventory.add(primary);
        inventory.remove(weapon1);
        this.primary=weapon1;

    }

    /**
     * Equips secondary weapon
     * 
     * @param  weapon1 weapon to equip as secondary
     */
    public void equipSecondary(Weapon weapon2)
    {

        inventory.add(secondary);
        inventory.remove(weapon2);
        this.secondary=weapon2;

    }

    /**
     *picks up an item
     * 
     * @param  item item to be picked up
     */
    public void pickup(Item item)
    {
        if(inventory.size()<inventory.capacity)
            inventory.add(item);
    }

    /**
     * Uses item and removes it from inventory
     * 
     * @param  item item to be used
     */
    public void use(Item item)
    {
        item.used=true;
        inventory.remove(item);
    }
    
    /**
     * RPG character attacks
     * @param target the thing to attack
     */
    public void attack(Thing target)
    {
        
    }
    
    /**
     * RPG character attacks with a specific attack
     * 
     * @param  attack attack to be used
     * @param target the thing to attack
     */
    public void attack(Attack attack, LivingThing target)
    {

    }
    
    /**
     * RPG character attacks with a weapon
     * 
     * @param  weapon weapon to be used
     * @param target the thing to attack
     */
    public void attack(Weapon weapon, LivingThing target)
    {
        
    }
    
    /**
     * RPG character attacks with a weapon
     * 
     * @param  weapon weapon to be used
     * @param target the thing to attack
     */
    public void attack(Weapon weapon, BodyPart target)
    {
        
    }
    
}
