package Chap03_DecoratorPattern;

public class StarbuzzCoffee {
    public static void main(String args[]){
        Beverage beverage=new Espresso("Tall");
        beverage=new Mocha(beverage);
        beverage=new Whip(beverage);
        beverage=new Soy(beverage);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage2=new HouseBlend("Grande");
        beverage2=new Whip(beverage2);
        beverage2=new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
    }
}
