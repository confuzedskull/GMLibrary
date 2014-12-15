package GameModel.Things.Items.Clothing;
import GameModel.Things.Items.Item;
import GameModel.Materials.Material;

/**
 * Clothing is an item to be worn in an Outfit by a SimCharacter or RPGCharacter
 * 
 * @author James Nakano
 */
public class Clothing extends Item
{
    public Material material;
    private boolean wet;

    /**
     * Constructor for objects of class Clothing
     */
    public Clothing()
    {
        wet=false;

    }

}
