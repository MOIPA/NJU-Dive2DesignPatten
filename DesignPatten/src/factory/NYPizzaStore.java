package factory;

import factory.pizza.NYStyleCheesePizza;
import factory.pizza.NYStyleVeggiPizza;
import factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }else if (type.equals("veggie")) {
            return new NYStyleVeggiPizza();
        }else{
            return null;
        }
    }
}
