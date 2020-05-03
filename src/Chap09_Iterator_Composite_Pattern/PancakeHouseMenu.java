package Chap09_Iterator_Composite_Pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
    public PancakeHouseMenu(){
        menuItems=new ArrayList();
        addItem("K&B 팬케이크 세트", "스크램블드 에그와 토스트가 곁들여진 팬케이크", true, 2.99);
        addItem("레귤러 팬테이크 세트", "달걀 후라이와 소시지가 곁들여진 팬케이크", false, 2.99);
        addItem("블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크", true, 3.49);
    }
    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem=new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public Iterator createIterator(){
        return menuItems.iterator();
        //return new PancakeHouseMenuIterator(menuItems);
    }

//    public ArrayList getMenuItems(){
//        return menuItems;
//    }
}
