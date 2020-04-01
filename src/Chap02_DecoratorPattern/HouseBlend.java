package Chap02_DecoratorPattern;

public class HouseBlend extends Beverage {

    public HouseBlend(String size){

        setSize(size);
        description="하우스블렌드 커피 "+ getSize();
    }


    @Override
    public double cost() {
        double cost=0;

        if(size=="Tall"){
            cost= 1.8;
        }else if(size=="Grande"){
            cost= 1.3;
        }else if(size=="Venti"){
            cost= 0.9;
        }
        return cost;

    }
}
