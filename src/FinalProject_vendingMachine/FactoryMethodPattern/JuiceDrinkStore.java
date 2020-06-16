package FinalProject_vendingMachine.FactoryMethodPattern;

public class JuiceDrinkStore extends DrinkStore{
    @Override
    protected Drink createDrink(String type) {
        if(type.equals("Apple")){
            return new AppleJuiceDrink();
        }else if(type.equals("Watermelon")){
            return new WatermelonJuiceDrink();
        }
        else if(type.equals("Strawberry")){
            return new StrawberryJuiceDrink();
        }else{
            return null;
        }
    }


}
