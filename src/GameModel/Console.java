package GameModel;
import GameModel.People.Character;
import GameModel.Things.Thing;
import GameModel.Things.LivingThings.LivingThing;
import GameModel.Places.*;
import java.util.Scanner;
import java.util.ArrayList; 
/**
 * A console for modifying things in the game
 * 
 * @author James Nakano
 * @version 2.0.0
 */
public class Console
{
    private static Universe universe;
    private static Player player;
    private static String command;
    private static int help_code;
    private static Thing object = new Thing();
    // private static ArrayList<String> command_list;
    private static Scanner scanner = new Scanner(System.in);

    public Console(Player player, Universe universe)
    {
        this.universe=universe;
        this.player=player;
    }

    private static void getCommand()
    {
        System.out.print(">");
        command = scanner.nextLine();
    }

    private static void getObject()
    {
        if(command.contains("me") || command.contains("my"))
        {
            object = player;
        }

        if(command.contains("nevermind"))
        {
            object = new Thing();
            object.name="new Thing";
            System.out.println("object reset");
        }
    }

    private static void getAction()
    {
        if(command.contains("create"))
        {
            if(command.length()==6)
            {
                System.out.println("what would you like to create?");
                getCommand();
            }
            if(command.contains("person"))
            {
                object= new Character();
                System.out.println("new character created.");
            }
            if(command.contains("place"))
            {
                object= new Place();
                System.out.println("new place created.");
            }
            if(command.contains("world"))
            {
                object= new World();
                System.out.println("new world created.");
            }
            if(command.contains("country"))
            {

                object= new Country();
                System.out.println("new country created.");
            }
            if(command.contains("continent"))
            {
                object= new Continent();
                System.out.println("new continent created.");
            }
            if(command.contains("city"))
            {
                object= new City();
                System.out.println("new city created.");
            }

            if(command.contains("thing"))
            {
                object= new Thing();
                System.out.println("new thing created.");
            }
            if(command.contains("living thing"))
            {
                object= new LivingThing();
                System.out.println("new living thing created.");
            }

        }
        if(command.contains("destroy"))
        {
            System.out.println("What would you like to destroy?");
            getObject();
            if(command.contains("everything"))
            {
                object.destroyAll();
                System.out.println("everything destroyed");
            }

        }
        if(command.contains("list"))
        {
            System.out.println("list what?");
            getCommand();
            if(command.contains("everything"))
            {
                System.out.print(Thing.getAllObjects());
            }
        }
        if(command.contains("set"))
        {
            if(command.equals("set"))
            {
                System.out.println("what would you like to set?");
                getCommand();
            }
            if(command.contains("name"))
            {
                System.out.println("enter a name.");
                getCommand();
                object.name=command;
                System.out.println("name set.");
            }

            if(command.contains("status"))
            {
                System.out.println("enter a status.");
                getCommand();
                object.status=command;
                System.out.println("status set.");
            }

        }

        if(command.contains("get"))
        {
            if(command.equals("get"))
            {
                System.out.println("what would you like to get?");
                getCommand();
            }

            if(command.contains("name"))
            {
                System.out.println(object.name);
            }

            if(command.contains("status"))
            {
                System.out.println(object.status);
            }

            if(command.contains("class"))
            {
                System.out.println(object.getClass().toString());
            }

        }
    }

    public static void main (String[] args)
    {   
        boolean done=false;

        command="start";
        System.out.println("Please enter a command. Type'help' for options");
        while(!done)
        {

            if(command.equals("quit"))
                done=true;
            else
            {

                getCommand();
            }

            getObject();
            getAction();

            if(command.contains("help"))
            {
                System.out.println("available commands: ");
                System.out.println("create");
                System.out.println("get");
                System.out.println("set");
                System.out.println("nevermind");
                System.out.println("quit");
            }

        }
        System.out.println("quitting");
        System.exit(0);

    }
}
