package Chap09_Iterator_Composite_Pattern;
import java.util.Iterator;
public class Waitress {
    //PancakeHouseMenu pancakeHouseMenu;
    //DinerMenu dinerMenu;
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu){
        this.pancakeHouseMenu=pancakeHouseMenu;
        this.dinerMenu=dinerMenu;
        this.cafeMenu=cafeMenu;
    }
    public void printMenu(){
        Iterator pancakeIterator=pancakeHouseMenu.createIterator();
        Iterator dinerIterator=dinerMenu.createIterator();
        Iterator cafeIterator=cafeMenu.createIterator();

        System.out.println("메뉴\n ----\n 아침메뉴");
        printMenu(pancakeIterator);

        System.out.println("\n 점심 메뉴");
        printMenu(dinerIterator);

        System.out.println("\n 저녁 메뉴");
        printMenu(cafeIterator);
    }
    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem=(MenuItem)iterator.next();
            System.out.print(menuItem.getName()+": ");
            System.out.print(menuItem.getPrice()+"-- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
