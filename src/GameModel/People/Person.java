
package GameModel.People;

import GameModel.Actions.Action;
import GameModel.Things.Items.Consumables.Food;
import java.util.ArrayList;

/**
 * Models a Person
 * @author James
 */
public class Person
{
    private String firstname,lastname;
    private Person mother,father;
    private ArrayList<Person>friends;
    private ArrayList<Person>acquaintances;
    private ArrayList<Person>children;
    private ArrayList<Person>siblings;
    private ArrayList<Food>favoriteFood;
    
    /**
     * Gets the person's full name
     * @return the person's full name
     */
    public String getFullName()
    {
        return firstname+" "+lastname;
    }
    /**
     * Gets the person's first name
     * @return the person's first name
     */
    public String getFirstname() {
        return firstname;
    }
    /**
     * Gets the person's last name
     * @return the person's last name
     */
    public String getLastname() {
        return lastname;
    }
    /**
     * Checks to see whether the given person is a father of this
     * @param person person to check
     * @return true if the given person is a father of this
     */
    public boolean isFather(Person person)
    {
        if(person==father)
            return true;
        else
            return false;
    }
    /**
     * Checks to see whether the given person is a mother of this
     * @param person person to check
     * @return true if the given person is a mother of this
     */
    public boolean isMother(Person person)
    {
        if(person==mother)
            return true;
        else
            return false;
    }
    /**
     * Checks to see whether the given person is a parent of this
     * @param person person to check
     * @return true if the given person is a parent of this
     */
    public boolean isParent(Person person)
    {
        if(person==mother||person==father)
            return true;
        else
            return false;
    }
    
    /**
     * Checks to see whether the given person is a grandfather of this
     * @param person person to check
     * @return true if the given person is a grandfather of this
     */
    public boolean isGrandFather(Person person)
    {
        if(person==father.father)
            return true;
        else
            return false;
    }
    /**
     * Checks to see whether the given person is a grandmother of this
     * @param person person to check
     * @return true if the given person is a grandmother of this
     */
    public boolean isGrandMother(Person person)
    {
        if(person==mother.mother)
            return true;
        else
            return false;
    }
    /**
     * Checks to see whether the given person is a grandparent of this
     * @param person person to check
     * @return true if the given person is a grandparent of this
     */
    public boolean isGrandParent(Person person)
    {
        if(person==mother.mother||person==father.father)
            return true;
        else
            return false;
    }
    /**
     * Checks to see if the given person is a sibling
     * @param person the person to check
     * @return true if the person is a sibling
     */
    public boolean isSibling(Person person)
    {
        if(siblings.contains(person))
            return true;
        else
            return false;
    }
    /**
     * Checks to see if the given person is a child of this
     * @param person the person to check
     * @return true if the person is a child of this
     */
    public boolean isChild(Person person)
    {
        if(children.contains(person))
            return true;
        else
            return false;
    }
    /**
     * Checks to see if the given person is a friend of this
     * @param person the person to check
     * @return true if the person is a friend
     */
    public boolean isFriend(Person person)
    {
        if(friends.contains(person))
            return true;
        else
            return false;
    }
   
}
