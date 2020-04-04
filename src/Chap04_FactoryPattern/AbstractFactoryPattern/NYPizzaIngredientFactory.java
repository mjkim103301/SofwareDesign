package Chap04_FactoryPattern.AbstractFactoryPattern;

import Chap04_FactoryPattern.NYStyleCheesePizza;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[]={new Carlic(), new Onion(), new Mushroom(), new RedPepper()};
        return  veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
    class ThinCrustDough extends NYPizzaIngredientFactory.Dough{}
    class MarinaraSauce extends NYPizzaIngredientFactory.Sauce{}
    class ReggianoCheese extends NYPizzaIngredientFactory.Cheese{}
    class SlicedPepperoni extends NYPizzaIngredientFactory.Pepperoni{}
    class FreshClams extends NYPizzaIngredientFactory.Clams{}


}
