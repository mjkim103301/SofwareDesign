package Chap09_Iterator_Composite_Pattern.GroupApp;

import java.util.Iterator;

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
    public void printTitle(String title){
        Iterator iterator=allStaff.createIterator();
        System.out.println("\n 직함별 직원정보 \n");
        while(iterator.hasNext()){
            StaffComponent staffComponent=(StaffComponent)iterator.next();
            try{
                if(staffComponent.getTitle()==title){
                    staffComponent.print();
                    staffComponent.remove();
                }
            }catch (UnsupportedOperationException e){}
        }
    }
    public void printWorkingYears(int year){
        Iterator iterator=allStaff.createIterator();
        System.out.println("\n"+year+"년 미만 근무한 직원정보 \n");
        while(iterator.hasNext()){
            StaffComponent staffComponent=(StaffComponent)iterator.next();
            try{
                if(staffComponent.getWorkingYears()<year){
                    staffComponent.print();
                    staffComponent.remove();
                }
            }catch (UnsupportedOperationException e){}
        }
    }

}
