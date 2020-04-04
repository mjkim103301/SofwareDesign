package Chap04_FactoryPattern.AbstractFactoryPattern;



public class ChicagoPizzaStore extends PizzaStore2 {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
        if(item.equals("cheese")){
            pizza=new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if(item.equals("clam")){
            pizza=new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}
