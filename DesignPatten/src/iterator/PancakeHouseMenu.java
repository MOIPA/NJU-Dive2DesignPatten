package iterator;

import iterator.item.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
    ArrayList menuItems;

    // 直接使用java的Iterator
    public Iterator createIterator() {
        return menuItems.iterator();
    }

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's pancake breakfast","pancake with scrambled eggs, and toast"
        ,true,2.99);
        addItem("Regular pancake breakfast","pancake with scrambled eggs, and saussage"
                ,false,2.99);
        addItem("Blueberry pancake breakfast","pancake with blueberries"
                ,true,3.49);
        addItem("Waffles","waffles"
                ,true,3.59);
    }

    public void addItem(String name, String description,boolean vegetarian,double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
}
