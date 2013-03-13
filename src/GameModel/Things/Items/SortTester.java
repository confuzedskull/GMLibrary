package GameModel.Things.Items;
import GameModel.Things.Items.Consumables.Food;
import GameModel.Things.Items.Item;
import GameModel.Things.Items.Weapons.*;
import GameModel.Things.Items.Clothing.*;
import GameModel.Things.Items.Containers.Container;

public class SortTester
{
    public static void main(String[] args)
   {
      Container box = new Container();
      Food apple = new Food();
      apple.name="Apple";
      Sword excalibur = new Sword();
      excalibur.name="Excalibur";
      Container bottle = new Container();
      bottle.name="Bottle";
      Item paper = new Item("Paper");
      Gun Shotgun = new Gun();
      Shotgun.name="Shotgun";
      Accessory Cape = new Accessory();
      Cape.name="Red Cape";
      
      box.capacity=6;
      box.add(apple);
      box.add(excalibur);
      box.add(bottle);
      box.add(paper);
      box.add(Shotgun);
      box.add(Cape);
      
      System.out.println();
      System.out.println("<Unsorted>");
      System.out.println("Names:" + box.getNames());
      System.out.println("Numbers:" + box.getNumbers());
      System.out.println("Classes:" + box.getClasses());
      System.out.println("Superclasses:" + box.getSuperclasses());
      box.sortByName();
      System.out.println();
      System.out.println("<Sorted by Name>");
      System.out.println("Names:" + box.getNames());
      System.out.println("Numbers:" + box.getNumbers());
      System.out.println("Classes:" + box.getClasses());
      System.out.println("Superclasses:" + box.getSuperclasses());
      box.sortByNumber();
      System.out.println();
      System.out.println("<Sorted by Number>");
      System.out.println("Names:" + box.getNames());
      System.out.println("Numbers:" + box.getNumbers());
      System.out.println("Classes:" + box.getClasses());
      System.out.println("Superclasses:" + box.getSuperclasses());
      box.sortByClass();
      System.out.println();
      System.out.println("<Sorted by Class>");
      System.out.println("Names:" + box.getNames());
      System.out.println("Numbers:" + box.getNumbers());
      System.out.println("Classes:" + box.getClasses());
      System.out.println("Superclasses:" + box.getSuperclasses());
      box.sortBySuperclass();
      System.out.println();
      System.out.println("<Sorted by Superclass>");
      System.out.println("Names:" + box.getNames());
      System.out.println("Numbers:" + box.getNumbers());
      System.out.println("Classes:" + box.getClasses());
      System.out.println("Superclasses:" + box.getSuperclasses());
      
   }
}
