package iterator;

import iterator.item.MenuItem;
import iterator.iterator.DinerMenuIterator;
import iterator.iterator.Iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems = new MenuItem[MAX_ITEMS];

    // 实现迭代器
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    public DinerMenu() {
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
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Overflow");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
}
