package GameModel.People;

import GameModel.Outfit;


/**
 * A SimCharacter is a character used in simulations
 * It is more detailed than a regular character and has needs that must be met.
 * 
 * @author James Nakano
 */
public class SimCharacter extends Character
{
  
    private String firstname;
    private String lastname;
    private String sex;
    Outfit clothes;
    

    /**
     * Constructor for objects of class SimCharacter
     */
    public SimCharacter()
    {
        
    }

}
