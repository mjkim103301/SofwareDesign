package Chap04_FactoryPattern.FactoryMethodPattern;

public class ChicagoStyleVeggiPizza extends Pizza {
    public ChicagoStyleVeggiPizza(){
        name="Chicago Style Deep Dish and Cheese Pizza";
        dough="Extra Thick Crust Dough";
        sauce="Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into squre slices");
    }
}
