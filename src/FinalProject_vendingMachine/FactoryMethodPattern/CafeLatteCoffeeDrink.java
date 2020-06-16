package FinalProject_vendingMachine.FactoryMethodPattern;

public class CafeLatteCoffeeDrink extends Drink {
    public CafeLatteCoffeeDrink(){
        name="카페라떼 음료수";
        ingredient="주재료: 원두";
        additionalMaterial.add("우유");
        additionalMaterial.add("휘핑크림");
    }
}
