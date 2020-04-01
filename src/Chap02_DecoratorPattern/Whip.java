package Chap02_DecoratorPattern;

public class Whip  extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휩";
    }

    @Override
    public double cost() {
        double cost=beverage.cost();
        String size=beverage.getSize();
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