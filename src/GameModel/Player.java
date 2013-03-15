package GameModel;

import GameModel.People.Character;
import java.util.ArrayList; 
/**
 * A player in the game
 * 
 * @author James Nakano 
 * @version (a version number or a date)
 */
public class Player extends Character
{
    // instance variables - replace the example below with your own
    
    private static ArrayList<Player> listOfPlayers = new ArrayList<Player>();
    private int[] action;
   
 
    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        name="Player #" + number;
        listOfPlayers.add(this);
        number=listOfPlayers.size();
        
    }
    


}
