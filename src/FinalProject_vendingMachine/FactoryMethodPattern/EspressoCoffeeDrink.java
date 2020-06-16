package FinalProject_vendingMachine.FactoryMethodPattern;

public class EspressoCoffeeDrink extends Drink {
    public EspressoCoffeeDrink(){
        name="에스프레소 커피 음료수";
        ingredient="주재료: 원두";
        additionalMaterial.add("설탕 시럽");
        price=3000;
    }
}
