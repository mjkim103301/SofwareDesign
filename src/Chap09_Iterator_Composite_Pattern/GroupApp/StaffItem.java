package Chap09_Iterator_Composite_Pattern.GroupApp;

public class StaffItem extends StaffComponent {
    String name,title;
    int workingYears;

    public StaffItem(String name, String title, int workingYears){
        this.name=name;
        this.title=title;
        this.workingYears=workingYears;
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
    }
}
