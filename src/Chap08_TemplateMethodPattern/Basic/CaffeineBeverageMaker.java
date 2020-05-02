package Chap08_TemplateMethodPattern.Basic;

public class CaffeineBeverageMaker {
    public static void main(String [] args){
        Tea myTea=new Tea();
        myTea.prepareRecipe();
        Coffee myCoffee=new Coffee();
        myCoffee.prepareRecipe();
    }
}
