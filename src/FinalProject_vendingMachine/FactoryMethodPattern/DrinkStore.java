package FinalProject_vendingMachine.FactoryMethodPattern;

public abstract class DrinkStore {
    public Drink orderDrink(String type){
        Drink drink;
        drink=createDrink(type);
        drink.prepare();
        drink.serve();
        return drink;
    }
    protected  abstract Drink createDrink(String type);
}
