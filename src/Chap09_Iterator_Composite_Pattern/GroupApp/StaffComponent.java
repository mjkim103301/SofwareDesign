package Chap09_Iterator_Composite_Pattern.GroupApp;

public abstract class StaffComponent {
    public void add(StaffComponent staffComponent){
        throw new UnsupportedOperationException();
    }
    public StaffComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public int getWorkingYears(){
        throw new UnsupportedOperationException();
    }
    public String getTitle(){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
}
