
package pkgfinal.project;
import java.util.ArrayList;
public class shoppingcard {
   ArrayList<item> items = new ArrayList<>();
 
    public void addItem(item item) {
        items.add(item);
    }
 
    public double getTotalCoast() {
        double totalCoast = 0;
 
        for (item item : items) {
            if (item instanceof countableitem) {
                totalCoast += ((countableitem) item).getitemcost();
            } else if (item instanceof uncountableitem) {
                totalCoast += ((uncountableitem) item).getitemcost();
            }
        }
 
        return totalCoast;
    }
 
    public void showItems() {
        countableitem item1 = null;
        uncountableitem item2 = null;
 
        for (item item : items) {
            if (item instanceof countableitem) {
                item1 = (countableitem) item;
 
                System.out.println(item1.getName() + "\t"
                        + item1.getitemcost() / item1.getNumofsubitem() + "\t"
                        + item1.getNumofsubitem() + "\t" + item1.getitemcost());
            } else if (item instanceof uncountableitem) {
                item2 = (uncountableitem) item;
                System.out.println(item2.getName() + "\t"
                        + item2.getitemcost() / item2.getWeigth() + "\t"
                        + item2.getWeigth() + "\t" + item2.getitemcost());
            }
        }
 
    }
}
           

      
      
      
 
    

