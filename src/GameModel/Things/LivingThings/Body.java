package GameModel.Things.LivingThings;
import GameModel.Things.LivingThings.BodyParts.BodyPart;
import GameModel.Materials.*;
import java.util.ArrayList; 
/**
 * A Body is a living thing
 * 
 * @author James Nakano 
 * @version (a version number or a date)
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
