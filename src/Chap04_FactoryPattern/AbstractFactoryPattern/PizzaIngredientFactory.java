package Chap04_FactoryPattern.AbstractFactoryPattern;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

     class Dough{}
  class Sauce{}
   class Cheese{}
 class Veggies{}
  class Pepperoni{}
class Clams{}
}
