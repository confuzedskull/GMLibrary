package GameModel;

import GameModel.Things.Items.Containers.Container;
import GameModel.Things.Items.Item;
import GameModel.Things.Thing;
import java.util.ArrayList; 
/**
 * A quest is an objective that consists of other objectives.
 * 
 * @author James Nakano
 */
public class Quest extends Thing
{
    private ArrayList<Objective> objectives = new ArrayList<Objective>();
    private static int questNumber;
    private ArrayList<Item> rewards = new ArrayList<Item>();
    private boolean complete;
    /**
     * Constructor for objects of class Quest
     */
    public Quest()
    {
        name="Quest"+questNumber;
        questNumber++;
        description="Complete all objectives";
        addObjective();
    }
    
    /**
     * Adds an objective to the quest
     */
    public void addObjective()
    {
        objectives.add(new Objective());
        objectives.get(objectives.size()).name="Objective #"+objectives.size()+":"+objectives.get(objectives.size()).description;
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
