package Chap09_Iterator_Composite_Pattern.GroupApp;

import Chap09_Iterator_Composite_Pattern.Composite.CompositeIterator;

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
    public Iterator createIterator(){//어떤 복합 객체에 대해서도 반복작업을 할 수 있는 반복자
        //waitress에서 채식주의자용 메뉴 항목만 뽑아내야 하는 경우
        return new GroupCompositeIterator(staffComponents.iterator());
    }
}
