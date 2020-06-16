package FinalProject_vendingMachine.TemplatePattern;

import FinalProject_vendingMachine.FactoryMethodPattern.Drink;

public class DrinkPrice implements PriceComparable {
   public  String name;
    public int price;

    public DrinkPrice(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String toString(){
        return name+" 가격: "+price;
    }
    @Override
    public int compareTo(Object object) {
        DrinkPrice drinkPrice=(DrinkPrice)object;
        if(price<drinkPrice.price){
            return -1;
        }else if(price==drinkPrice.price){
            return 0;
        }else{
            return 1;
        }
    }
}
