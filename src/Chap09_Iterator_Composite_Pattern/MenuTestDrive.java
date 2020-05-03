package Chap09_Iterator_Composite_Pattern;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String args[]){
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        CafeMenu cafeMenu=new CafeMenu();
        ArrayList array =new ArrayList();
        array.add(pancakeHouseMenu);
        array.add(dinerMenu);
        array.add(cafeMenu);
        //Waitress waitress=new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        Waitress waitress=new Waitress(array);
        waitress.printMenu();
    }
}
