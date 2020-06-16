package FinalProject_vendingMachine.FactoryMethodPattern;

import java.util.ArrayList;

public abstract class Drink {
    String name;
    String ingredient;
    int price;
    ArrayList additionalMaterial=new ArrayList();

    void prepare(){
        System.out.println("준비중인 음료: "+name);
        System.out.println("가격(원): "+price);
        System.out.println("주 재료: "+ingredient);
        System.out.println("부가 재료들...");
        for(int i=0;i<additionalMaterial.size();i++){
            System.out.println(" "+additionalMaterial.get(i));
        }
    }
    void serve(){
        System.out.println("재료를 컵에 따른 후 손님 호출");
    }
    void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){return price;}


}
