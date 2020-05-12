package Chap09_Iterator_Composite_Pattern.GroupApp;

public class Waitress {
    StaffComponent allStaff;
    public Waitress(StaffComponent allStaff){
        this.allStaff=allStaff;
    }
    public void printStaff(){
        allStaff.print();
    }
 /*   public void printVegetarianMenu(){
        Iterator iterator=allMenus.createIterator();
        System.out.println("\n Vegetarian Menu \n----");
        while(iterator.hasNext()){
            MenuComponent menuComponent=(MenuComponent)iterator.next();
            try{
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch(UnsupportedOperationException e){}
        }
    }*/
    public void printTitle(){

    }
}
