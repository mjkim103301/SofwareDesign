package Chap03_DecoratorPattern;

public abstract class Beverage {
    String description="제목없음";
    String size="사이즈없음";
    public String getDescription(){
        return description;
    }
    public String getSize(){
        return size;
    }
   public void setSize(String size){
        this.size=size;
   }

    public abstract double cost();
}
