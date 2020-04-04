package Chap04_FactoryPattern.AbstractFactoryPattern;

public class PizzaTestDrive2 {
    public static void main(String []args){
        PizzaStore2 nyPizzaStore=new NYPizzaStore();
        PizzaStore2 chicagoPizzaStore=new ChicagoPizzaStore();

        nyPizzaStore.orderPizza("cheese");


        chicagoPizzaStore.orderPizza("cheese");


    }
}
