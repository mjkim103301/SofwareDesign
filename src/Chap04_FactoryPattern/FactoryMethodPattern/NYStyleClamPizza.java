package Chap04_FactoryPattern.FactoryMethodPattern;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza(){
        name="NY Style Sauce and Cheese Pizza";
        dough="Thin Crust Dough";
        sauce="Marinara Sauce";

        toppings.add("grated Reggiano Cheese");
    }
}