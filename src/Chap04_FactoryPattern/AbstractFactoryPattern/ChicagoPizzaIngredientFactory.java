package Chap04_FactoryPattern.AbstractFactoryPattern;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
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
        return new FrozenClams();
    }
    class ThickCrustDough extends ChicagoPizzaIngredientFactory.Dough{}
    class PlumTomatoSauce extends ChicagoPizzaIngredientFactory.Sauce{}
    class MozzarellaCheese extends ChicagoPizzaIngredientFactory.Cheese{}
    class SlicedPepperoni extends ChicagoPizzaIngredientFactory.Pepperoni{}
    class FrozenClams extends ChicagoPizzaIngredientFactory.Clams{}
}
