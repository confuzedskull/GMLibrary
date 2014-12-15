package GameModel.Actions;

/**
 * Every action has a cost and a difficulty
 *
 * @author James
 */
public class Action
{

    private int cost;
    private int difficulty;
    private boolean done;
    private int timesPerformed;

    /**
     * Creates a new Action
     *
     */
    public Action()
    {
        cost = 0;
        difficulty = 0;
        done = false;
    }

    /**
     * Gets the cost of the action.
     *
     * @return the cost of the action
     */
    public int getCost()
    {
        return cost;
    }

    /**
     * Gets the level of difficulty
     *
     * @return an integer representing the level of difficulty
     */
    public int getDifficulty()
    {
        return difficulty;
    }

    /**
     * Gets how many times the action has been performed
     *
     * @return the number of times performed
     */
    public int getTimesPerformed()
    {
        return timesPerformed;
    }

    /**
     * Performs the action
     */
    public void perform()
    {
        if (done)
        {
            timesPerformed++;
            done=false;
        }
    }
}
