package Chap02_DecoratorPattern;

public class Espresso extends Beverage {


    public Espresso(String size){
        setSize(size);

        description="에스프레소 "+size;
    }



    public double cost(){
        double cost=0;

        if(size=="Tall"){
            cost= 1.99;
        }else if(size=="Grande"){
            cost= 1.5;
        }else if(size=="Venti"){
            cost= 1.0;
        }
       return cost;
    }
}
