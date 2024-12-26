package factory.pizza;

public class ChicagoStyleVeggiPizza extends Pizza {
    public ChicagoStyleVeggiPizza() {
        name = "Chicago Style Veggi Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Plum Tomato Sauce");
    }
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
