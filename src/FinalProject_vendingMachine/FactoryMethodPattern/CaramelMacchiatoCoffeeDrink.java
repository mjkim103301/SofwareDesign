package FinalProject_vendingMachine.FactoryMethodPattern;

public class CaramelMacchiatoCoffeeDrink extends Drink {
    public CaramelMacchiatoCoffeeDrink(){
        name="카라멜 마끼야또 음료수";
        ingredient="주재료: 원두";
        additionalMaterial.add("카라멜");
        additionalMaterial.add("휘핑크림");
    }

}
