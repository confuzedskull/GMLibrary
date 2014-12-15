package GameModel.Places;
import GameModel.Places.Place;
import GameModel.Things.Door;
import GameModel.Things.Window;
import GameModel.Places.Light;
import GameModel.Things.Items.Key;

/**
 * A room is a place that has a door
 * 
 * @author James Nakano 
 */
public class Room extends Place
{
    private Door[] doors;
    private Window[] windows;
    private Light lightsource;
    

    /**
     * Constructor for objects of class Room
     */
    public Room(int doors, int windows)
    {
        name="Generic Room";
        description="an empty room";
        status="empty";
        this.doors=new Door[doors];
        this.windows=new Window[windows];

    }

    /**
     * locks all doors
     * 
     * @param  key   a key to lock all doors
     */
    public void lockAllDoors()
    {
        for(int door=0; door<doors.length;door++)
        {
            doors[door].lock.lock(Key.skeleton);
        }

    }
    
    /**
     * unlocks all doors
     * 
     * @param  key   a key to unlock all doors
     */
    public void unlockAllDoors()
    {
        for(int door=0; door<doors.length;door++)
        {
            doors[door].lock.unlock(Key.skeleton);
        }

    }
}
