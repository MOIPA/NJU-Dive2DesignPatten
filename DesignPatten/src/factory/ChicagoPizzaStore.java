package factory;

import factory.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiPizza();
        }else{
            return null;
        }
    }
}
