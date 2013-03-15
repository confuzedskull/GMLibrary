
package GameModel.People;

import GameModel.Attribute;
import java.util.ArrayList;

/**
 * A Person with emotions
 * @author James
 */
public class EmotionalPerson {
    private Attribute happiness;
    private Attribute sadness;
    private Attribute alertness;
    private Attribute excitement;
    private Attribute stress;
    private Attribute confidence;
    private Attribute anger;
    private ArrayList<Attribute> emotions;
    /**
     * Gets the emotion with the highest value
     * @return the emotion with the highest value
     */
    public Attribute strongestEmotion()
    {
        Attribute greatest = new Attribute();
        greatest.value=0;
        for(int i=0;i<emotions.size();i++)
        {
            if(emotions.get(i).value>greatest.value)
                greatest=emotions.get(i);       
        }
        return greatest;
    }
    /**
     * Gets the emotion with the lowest value
     * @return the emotion with the lowest value
     */
    public Attribute weakestEmotion()
    {
        Attribute lowest = new Attribute();
        lowest.value=0;
        for(int i=0;i<emotions.size();i++)
        {
            if(emotions.get(i).value<lowest.value)
                lowest=emotions.get(i);       
        }
        return lowest;
    }
    
    
}
