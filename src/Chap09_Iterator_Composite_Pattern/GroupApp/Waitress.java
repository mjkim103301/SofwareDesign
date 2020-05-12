package Chap09_Iterator_Composite_Pattern.GroupApp;

public class Waitress {
    StaffComponent allStaff;
    public Waitress(StaffComponent allStaff){
        this.allStaff=allStaff;
    }
    public void printStaff(){
        allStaff.print();
    }
}
