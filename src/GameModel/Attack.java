package GameModel;


/**
 * An Attack has damage properties and critical hit chance
 * 
 * @author James Nakano 
 */
public class Attack extends Attribute
{
    public int physical, magic,fire,water,ice,earth,wind;
    public int crit_chance;
    private String name;
    private int uses; //number of uses left

    /**
     * Creates an Attack. The default attack is Tackle
     */
    public Attack()
    {
        name="Tackle";
        description="A basic physical attack";
        physical=10;
        magic=0;

    }
    

}
