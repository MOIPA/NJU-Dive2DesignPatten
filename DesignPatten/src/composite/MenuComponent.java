package composite;


import java.util.Iterator;

public abstract class MenuComponent {

    // 以下的都属于menu的功能
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // 以下的都是属于menuItem的功能
    public String getName(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public String getDescription(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public double getPrice(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public boolean isVegetarian(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    // print属于两者都有的功能
    public void print(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    // 迭代器用于遍历对象
    public abstract Iterator createIterator();
}
