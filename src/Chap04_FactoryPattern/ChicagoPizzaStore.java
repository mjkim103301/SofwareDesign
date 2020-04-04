package Chap04_FactoryPattern;

public class ChicagoPizzaStore extends PizzaStore  {
    public Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(item.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }else if(item.equals("clam")){
            return new ChicagoStyleClamPizza();
        }else if(item.equals("veggi")){
            return new ChicagoStyleVeggiPizza();
        }else{
            return null;
        }
    }
}
