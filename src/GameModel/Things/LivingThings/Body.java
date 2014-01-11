package GameModel.Things.LivingThings;
import GameModel.Things.LivingThings.BodyParts.BodyPart;
import GameModel.Materials.*;
import java.util.ArrayList; 
/**
 * The main structure that makes up a living thing
 * 
 * @author James Nakano 
 */
public class Body extends LivingThing
{
    private ArrayList<BodyPart> bodyparts = new ArrayList<BodyPart>();
    private Skin skin;
    /**
     * Constructor for objects of class Body
     */
    public Body()
    {

    }

    
}
