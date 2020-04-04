package Chap04_FactoryPattern;

public class NYPIzzaStore extends PizzaStore {
    public Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else if(item.equals("clam")){
            return new NYStyleClamPizza();
        }else if(item.equals("veggi")){
            return new NYStyleVeggiPizza();
        }else{
            return null;
        }
    }
}
