package Chap04_FactoryPattern.FactoryMethodPattern;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza(){
        name="NY Style Sauce and Cheese Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";

        toppings.add("grated Reggiano Cheese");
    }
}