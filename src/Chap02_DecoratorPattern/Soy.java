package Chap02_DecoratorPattern;

public class Soy extends CondimentDecorator{
    Beverage beverage;
    public Soy (Beverage beverage){
        this.beverage=beverage;
    }

    public String getSize(){
        return beverage.getSize();
    }

    @Override
    public void setSize(String size) {

    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", 두유";
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
