package Chap03_DecoratorPattern;

public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha (Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", 모카";
    }
    public String getSize(){
        return beverage.getSize();
    }
    @Override
    public double cost() {
        double cost=beverage.cost();
        String size=getSize();
        if(size=="Tall"){
            cost+=.10;
        }
        else if(size=="Grande"){
            cost+=.15;
        }
        else if(size=="Venti"){
            cost+=.20;

        }
        return cost;
    }
}
