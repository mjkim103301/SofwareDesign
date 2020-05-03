package Chap09_Iterator_Composite_Pattern.Composite;

public class Waitress {
    MenuComponent allMenus;
    public Waitress(MenuComponent allMenus){
        this.allMenus=allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }
}
