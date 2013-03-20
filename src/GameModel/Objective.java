package GameModel;
import GameModel.Things.Thing;
/**
 * An objective is a task that must be completed in order to progress in the game.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Objective extends Thing
{
    private boolean complete;

    /**
     * Creates a new Objective
     */
    public Objective()
    {
        name="Objective";
        description="Do this.";
        complete=false;
    }

    public Objective(String name)
    {
        this.name=name;
        description="Do this.";
        complete=false;
    }
 
}
