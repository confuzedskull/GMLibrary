package GameModel.Things.Items.Containers;
import GameModel.Things.Items.Item;

import java.util.ArrayList; 
import java.lang.Character;
/**
 * A container stores things
 * 
 * @author James Nakano
 */
public class Container extends Item
{
    public ArrayList<Item> contents = new ArrayList<Item>();
    public int capacity;
    /**
     * Constructor for objects of class Container
     */
    public Container()
    {
        

    }

    /**
     * adds item to the container
     */
    public void add(Item item)
    {
        if(contents.size()<=capacity)
        {
            contents.add(item);
        }
        
    }

    /**
     * gets item from container at specified index
     * @return the item
     */
    public Item get(int index)
    {
        return contents.get(index);
    }

    /**
     * removes item from the container
     */
    public void remove(Item item)
    {
        contents.remove(item);
    }

    /**
     * gets size of container
     */
    public int size()
    {
        return contents.size();
    }

    /**
     * sorts items alphabetically by name
     */
    public void sortByName()
    {
        String startingletters="";
        for(int ascii=65; ascii<90; ascii++)
        {
            startingletters = String.valueOf((char)ascii);
            for(int i=0;i<contents.size();i++)
            {
                if(contents.get(i).name.startsWith(startingletters))
                {
                    contents.add(contents.get(i));
                    contents.remove(i);
                }

            }
        }

    }
    
    /**
     * sorts items by number
     */
    public void sortByNumber()
    {
        for(int number=0; number<Item.listOfAllItems.size(); number++)
        {
            
            for(int i=0;i<contents.size();i++)
            {
                if(contents.get(i).itemNumber==number)
                {
                    contents.add(contents.get(i));
                    contents.remove(i);
                }

            }
        }

    }
    
    /**
     * sorts items alphabetically by category
     */
    public void sortByCategory()
    {
        String startingletters="";
        for(int ascii=65; ascii<90; ascii++)
        {
            startingletters = String.valueOf((char)ascii);
            for(int i=0;i<contents.size();i++)
            {
                
                if(contents.get(i).category.startsWith(startingletters))
                {
                    contents.add(contents.get(i));
                    contents.remove(i);
                }

            }
        }

    }
    
    /**
     * sorts items alphabetically by class
     */
    public void sortByClass()
    {
        String startingletters="";
        for(int ascii=65; ascii<90; ascii++)
        {
            startingletters = String.valueOf((char)ascii);
            for(int i=0;i<contents.size();i++)
            {
                
                if(contents.get(i).getClass().getName().startsWith(startingletters))
                {
                    contents.add(contents.get(i));
                    contents.remove(i);
                }

            }
        }

    }
    
    /**
     * sorts items alphabetically by superclass
     */
    public void sortBySuperclass()
    {
        String startingletters="";
        for(int ascii=65; ascii<90; ascii++)
        {
            startingletters = String.valueOf((char)ascii);
            for(int i=0;i<contents.size();i++)
            {
                
                if(contents.get(i).getClass().getSuperclass().getName().startsWith(startingletters))
                {
                    contents.add(contents.get(i));
                    contents.remove(i);
                }

            }
        }

    }

    /**
     * Creates a string of item names
     * @return list of items 
     */
    public ArrayList<String> getNames()
    {
        ArrayList<String> listOfItems =  new ArrayList();
        for(int i=0;i<contents.size();i++)
        {
            listOfItems.add(contents.get(i).name);
        }
        return listOfItems;
    }
    
    /**
     * Creates a list of the categories
     * @return list of items 
     */
    public ArrayList<String> getCategories()
    {
        ArrayList<String> listOfItems =  new ArrayList();
        for(int i=0;i<contents.size();i++)
        {
            listOfItems.add(contents.get(i).category);
        }
        return listOfItems;
    }
    
    /**
     * Creates a list of the item numbers
     * @return list of items 
     */
    public ArrayList<Integer> getNumbers()
    {
        ArrayList<Integer> listOfItems = new ArrayList();
        for(int i=0;i<contents.size();i++)
        {
            listOfItems.add(contents.get(i).itemNumber);
        }
        return listOfItems;
    }
    
    /**
     * Creates a list of the item classes
     * @return list of items 
     */
    public ArrayList<String> getClasses()
    {
        ArrayList<String> listOfItems = new ArrayList();
        for(int i=0;i<contents.size();i++)
        {
            listOfItems.add(contents.get(i).getClass().getName());
        }
        return listOfItems;
    }
    
    /**
     * Creates a list of the item superclasses
     * @return list of items 
     */
    public ArrayList<String> getSuperclasses()
    {
        ArrayList<String> listOfItems = new ArrayList();
        for(int i=0;i<contents.size();i++)
        {
            listOfItems.add(contents.get(i).getClass().getSuperclass().getName());
        }
        return listOfItems;
    }
    
    
}
