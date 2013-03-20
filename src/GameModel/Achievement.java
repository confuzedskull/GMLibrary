
package GameModel;

import GameModel.Things.Thing;
import java.util.ArrayList;

/**
 * An award for completing a specific task in the game
 * @author James
 */
public class Achievement extends Thing
{
    private boolean complete;
    private int total;
    private int completed;
    private int reward;
    
    public Achievement()
    {
        name="Achievement";
        description="You did something!";
        complete=false;
        status="not completed";
        completed=0;
        total=1;
    }
    /**
     * Gets the status of completion
     * @return a string representing the number of objectives complete
     */
    public String getStatus()
    {
        status="completed: "+completed+ "/"+total;
        return status;
    }
    
    /**
     * Checks whether the all the objectives are complete
     * @return true if the achievement is complete
     */
    public boolean isComplete()
    {
        if(completed==total)
            complete=true;
        else complete=false;
        return complete;
    }
    
    
}
