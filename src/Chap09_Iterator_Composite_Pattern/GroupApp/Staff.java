package Chap09_Iterator_Composite_Pattern.GroupApp;

import java.util.ArrayList;
import java.util.Iterator;

public class Staff extends StaffComponent {
    ArrayList staffComponents=new ArrayList();
    String name, title;
    int workingYears;

    public Staff(String name, String title, int workingYears){
        this.name=name;
        this.title=title;
        this.workingYears=workingYears;
    }
    public void add(StaffComponent staffComponent){
        staffComponents.add(staffComponent);
    }
    public StaffComponent getChild(int i){
        return (StaffComponent)staffComponents.get(i);
    }
    public String getName(){
        return name;
    }
    public String getTitle(){
        return title;
    }
    public int getWorkingYears(){
        return workingYears;
    }
    public void print(){
        System.out.println(" "+getName()+", "+getTitle()+", "+getWorkingYears()+"년 근무");
        Iterator iterator=staffComponents.iterator();
        while(iterator.hasNext()){
            StaffComponent staffComponent=(StaffComponent)iterator.next();
            staffComponent.print();
        }
    }
}
