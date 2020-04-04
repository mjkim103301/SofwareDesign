package Chap04_FactoryPattern.FactoryMethodPattern;

public class NYStyleVeggiPizza extends Pizza {
    public NYStyleVeggiPizza(){
        name="NY Style Sauce and Cheese Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";

        toppings.add("grated Reggiano Cheese");
    }
}