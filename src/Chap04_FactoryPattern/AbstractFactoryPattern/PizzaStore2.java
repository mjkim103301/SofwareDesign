package Chap04_FactoryPattern.AbstractFactoryPattern;

public abstract class PizzaStore2 {
    public Pizza orderPizza(String type){
        Chap04_FactoryPattern.AbstractFactoryPattern.Pizza pizza;
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Chap04_FactoryPattern.AbstractFactoryPattern.Pizza createPizza(String type);
}
