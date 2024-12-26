package decorator;

import decorator.coffee.Beverage;
import decorator.coffee.Espresso;
import decorator.coffee.HouseBlend;
import decorator.coffee.Mocha;
import org.junit.jupiter.api.Test;

class CoffeeTest {

    @Test
    public void testCoffee() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$" + beverage.cost());
        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.getDescription() + "$" + beverage3.cost());
    }

}