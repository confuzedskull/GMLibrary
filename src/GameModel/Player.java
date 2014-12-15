package GameModel;

import GameModel.People.Character;
import java.util.ArrayList; 
/**
 * A player in the game
 * 
 * @author James Nakano 
 */
public class Player extends Character
{
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
