package Chap04_FactoryPattern;

public class PizzaTestDrive {
    public static void main(String []args){
        PizzaStore nyStore=new NYPIzzaStore();
        PizzaStore chicagoStore=new ChicagoPizzaStore();

        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        pizza=chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+pizza.getName()+"\n");

    }
}
