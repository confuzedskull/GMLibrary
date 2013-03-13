package GameModel.Things;
import GameModel.Things.Items.Key;


/**
 * Write a description of class Lock here.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Lock
{
    // instance variables - replace the example below with your own
    private Key key;
    private boolean locked;

    /**
     * Constructor for objects of class Lock
     */
    public Lock()
    {
        locked=true;

    }

                /**
     * Unlocks the lock
     * 
     * @param  key A key to be used
     */
    public void unlock(Key key)
    {
        if(key.getCode()==this.key.getCode() || key.getCode()==Key.skeleton.getCode())
        locked=false;
    }
    
    /**
     * Locks the lock
     * 
     * @param  key  a key to be used
     */
    public void lock(Key key)
    {
        if(key.getCode()==this.key.getCode() || key.getCode()==Key.skeleton.getCode())
        locked=true;
    }
}
