package Chap04_FactoryPattern.AbstractFactoryPattern;

public abstract class Pizza {
    String name;
    PizzaIngredientFactory.Dough dough;
    PizzaIngredientFactory.Sauce sauce;
    PizzaIngredientFactory.Veggies veggies[];
    PizzaIngredientFactory.Cheese cheese;
    PizzaIngredientFactory.Pepperoni pepperoni;
    PizzaIngredientFactory.Clams clam;

     public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
   public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
 public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
    void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
  /*  public void toString(){
        System.out.println(getName());
    }*/
}
