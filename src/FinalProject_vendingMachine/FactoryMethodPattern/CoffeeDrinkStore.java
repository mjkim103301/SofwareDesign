package FinalProject_vendingMachine.FactoryMethodPattern;

public class CoffeeDrinkStore extends DrinkStore {
    @Override
    protected Drink createDrink(String type) {
        if(type.equals("Espresso")){
            return new EspressoCoffeeDrink();
        }else if(type.equals("Cafe Latte")){
            return new CafeLatteCoffeeDrink();
        }
        else if(type.equals("Caramel macchiato")){
            return new CaramelMacchiatoCoffeeDrink();
        }else{
            return null;
        }
    }
}
