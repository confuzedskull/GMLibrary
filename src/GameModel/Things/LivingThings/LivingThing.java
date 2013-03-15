package GameModel.Things.LivingThings;
import GameModel.Things.Thing;
import GameModel.Attribute;
import GameModel.Places.Place;
import GameModel.Things.Items.Consumables.Food;
import GameModel.Things.Items.Consumables.Beverage;
import java.util.ArrayList; 
import java.util.Random;
/**
 * A Living Object has health. It needs to eat,drink, and reproduce in order to survive.
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class LivingThing extends Thing
{
    private static ArrayList<LivingThing> livingThings = new ArrayList<LivingThing>();
    private Attribute health,hunger,thirst;
    private String gender;
    private int age;
    private boolean living;
    private boolean injured;
    public Place home;
    private LivingThing mother,father;
    private ArrayList<LivingThing> children = new ArrayList<LivingThing>();
    private ArrayList<LivingThing> siblings = new ArrayList<LivingThing>();
    

    /**
     * Constructor for objects of class LivingObject
     */
    public LivingThing()
    {
        name="Generic Living Object";
        livingThings.add(this);
        living=true;
        status="born";
        age=0;
        if(new Random().nextBoolean())
            gender="male";
        else
            gender="female";
    }

    public LivingThing(String name)
    {
        this.name=name;
        livingThings.add(this);
        living=true;
        status="born";
        if(new Random().nextBoolean())
            gender="female";
        else
            gender="male";
    }

    /**
     * Feeds the living object.
     * @param food_item the food item to be eaten
     */   
    public void eat(Food food_item)
    {
        hunger.value-=food_item.bonus;
        food_item.destroy();
        status="ate";
    }

    /**
     * Living Thing eats another living thing
     * @param prey the other livingthing to be eaten
     */   
    public void eat(LivingThing prey)
    {
        hunger.value-=prey.health.value;
        prey.kill();
        status="ate";
    }

    /**
     * The living object drinks
     * @param drink the beverage to be drunk
     */   
    public void drink(Beverage drink)
    {
        thirst.value-=drink.bonus;
        status="drank";
    }

    /**
     * The living thing reproduces asexually
     */   
    public void reproduce()
    {
        livingThings.add(new LivingThing());
    }
    
    /**
     * The living thing reproduces sexually
     * @param mate the mate to reproduce with
     */   
    public void reproduce(LivingThing mate)
    {
        children.add(new LivingThing("child"+children.size()));
        status="just had sex!";
        if(this.getGender().equals("male"))
        {
            children.get(children.size()).father=this;
            children.get(children.size()).mother=mate;
        }
        else
        {
            children.get(children.size()).mother=this;
            children.get(children.size()).father=mate;
        }
    }

    /**
     * Sets the home of the living object
     * @param new_home the home to set
     */   
    public void setHome(Place new_home)
    {
        home=new_home;
    }

    /**
     * Gets the gender of the living object
     * @return the gender of the living thing
     */   
    public String getGender()
    {
        return gender;
    }

    /**
     * Gets the status of the object
     * @return the status of the living object
     */   
    public String getStatus()
    {
        status="health: "+health.getStatus() + " hunger: "+ hunger.getStatus() + " thirst:" + thirst.getStatus();
        return status;
    }

    /**
     * Calculates the health of the object
     * @return the health of the living object
     */   
    public int getHealth()
    {
        health.value-=getHunger() + getThirst();

        if(health.value<25)
            health.setStatus("dying");

        if(health.value==0)
            living=false;

        return health.value;
    }

    /**
     * Calculates the hunger of the living thing
     */   
    public int getHunger()
    {
        if(hunger.value==0)
        {
            hunger.setStatus(" full");
        }
        if(hunger.value>25)
        {
            hunger.setStatus(" hungry");
        }

        if(hunger.value>50)
        {
            hunger.setStatus(" famished");
        }
        return hunger.value;
    }

    /**
     * Calculates the thirst of the living thing
     */   
    public int getThirst()
    {
        if(thirst.value==0)
        {
            thirst.setStatus("quenched");
        }
        else
        {
            thirst.setStatus("thirsty");
        }
        if(thirst.value>50)
        {
            thirst.setStatus("parched");
        }
        return thirst.value;
    }

    /**
     * kills this object
     */   
    public void kill()
    {
        living=false;
        status="killed";
    }

    /**
     * kills every living thing
     */
    public static void killAllLivingThings()
    {
        for(int i=0; i<livingThings.size(); i++)
        {
            livingThings.get(i).kill();
        } 
    }

}
