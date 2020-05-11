package Chap09_Iterator_Composite_Pattern.Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList menuComponents=new ArrayList();
    String name;
    String description;
    public Menu(String name, String description){
        this.name=name;
        this.description=description;
    }
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponents.get(i);
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void print(){
        System.out.print("\n"+getName());
        System.out.println(","+getDescription());
        System.out.println("----------------");

        Iterator iterator =menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent=(MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
    public Iterator createIterator(){//어떤 복합 객체에 대해서도 반복작업을 할 수 있는 반복자
        //waitress에서 채식주의자용 메뉴 항목만 뽑아내야 하는 경우
        return new CompositeIterator(menuComponents.iterator());
    }
}
