
package GameModel.Actions;

/**
 * Every action has a cost, difficulty level, and requires people to perform the action
 * @author James
 */
public class Action {
    
    private int cost;
    private int requiredPeople;
    private int difficulty;
    
    /**
     * Creates a new Action
     * 
     */
    public Action()
    {
        cost=0;
        requiredPeople=1;
        difficulty=0;
    }
    /**
     * Gets the cost of the action.
     * @return the cost of the action
     */
    public int getCost() {
        return cost;
    }
    /**
     * Gets the required number of people
     * @return the number of required people
     */
    public int getRequiredPeople() {
        return requiredPeople;
    }
    /**
     * Gets the level of difficulty
     * @return an integer representing the level of difficulty
     */
    public int getDifficulty() {
        return difficulty;
    }
    
   
    
}
