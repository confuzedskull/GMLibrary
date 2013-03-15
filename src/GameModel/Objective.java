package GameModel;
import GameModel.Things.Thing;
import GameModel.Things.Items.Item;
import GameModel.Things.Items.Containers.Container;
import java.util.ArrayList; 
/**
 * An objective is a task that must be completed in order to progress in the game.
 * When the objective is complete, a player may be rewarded
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Objective extends Thing
{
    private boolean complete;
    private int score;
    private ArrayList<Item> rewards = new ArrayList<Item>();

    /**
     * Creates a new Objective
     */
    public Objective()
    {
        name="Objective";
        description="Do this.";
        complete=false;
        score=0;
    }

    public Objective(String name)
    {
        this.name=name;
        description="Do this.";
        complete=false;
        score=0;
    }

    /**
     * Adds an item to the rewards
     * @param reward an item to be rewarded
     */
    public void addReward(Item reward)
    {
        rewards.add(reward);
    }

    /**
     * Transfers rewards to a container
     * @param box container to hold rewards
     */
    public void getReward(Container box)
    {
        if(complete)
            for(int item=0; item<rewards.size();item++)
            {
                box.add(rewards.get(item));
        }
        else
            status="not complete";
    }
}
