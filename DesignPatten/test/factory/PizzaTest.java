package factory;

import factory.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    public void testPizza() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("A ordered Pizza is " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("B ordered Pizza is " + pizza.getName());
    }
}