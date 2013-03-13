package GameModel;

import java.util.ArrayList; 
/**
 * Write a description of class Quest here.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Quest extends Objective
{
    private ArrayList<Objective> objectives = new ArrayList<Objective>();
    private static int questNumber;
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
   
}
