package composite;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class MenuItemTest {

    @Test
    public void run(){
        MenuComponent menuAll = new Menu("All Menu","all menus");

        MenuComponent menuA = new Menu("menuA","menuA description");
        MenuComponent menuB = new Menu("menuB","menuB description");
        MenuComponent menuC = new Menu("menuC","menuC description");
        MenuComponent menuAItem1 = new MenuItem("menu A item 1","menu A item 1 description",true,3.99);
        MenuComponent menuAItem2 = new MenuItem("menu A item 2","menu A item 2 description",true,5.99);
        MenuComponent menuBItem1 = new MenuItem("menu B item 1","menu b item 1 description",true,4.99);
        MenuComponent menuBItem2 = new MenuItem("menu B item 2","menu b item 2 description", false,1.99);
        MenuComponent menuBItem3 = new MenuItem("menu B item 3","menu b item 3 description",true,2.99);
        MenuComponent menuCItem1 = new MenuItem("menu C item 1","menu C item 1 description",true,3.99);

        menuA.add(menuAItem1);
        menuA.add(menuAItem2);
        menuB.add(menuBItem1);
        menuB.add(menuBItem2);
        menuB.add(menuBItem3);
        menuC.add(menuCItem1);

        menuA.add(menuC);
        menuAll.add(menuA);
        menuAll.add(menuB);
        menuAll.print();

        System.out.println("----------------external");
        Iterator iterator = menuA.createIterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try{
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch(Exception e){}
        }
    }

}