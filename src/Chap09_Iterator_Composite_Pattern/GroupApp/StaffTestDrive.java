package Chap09_Iterator_Composite_Pattern.GroupApp;

public class StaffTestDrive {
    public static void main(String args[]){
        StaffComponent staff1=new Staff("김회장", "대표이사", 4);
        StaffComponent staff2=new Staff("김부장", "판매담당", 7);
        StaffComponent staff3=new Staff("박부장", "생산담당", 5);
        StaffComponent staff4=new Staff("이부장", "인력담당",1);

        StaffComponent staff5=new Staff("이과장", "과장",8);
        StaffComponent allStaff=new Staff("전체 사원", "사원이름, 직함, 근속년수", 0);

        allStaff.add(staff1);
        staff1.add(staff2);
        staff1.add(staff3);
        staff1.add(staff4);

        staff1.add(new StaffItem("김사원", "사원", 1));
        staff1.add(new StaffItem("강사원", "사원", 3));
        staff3.add(staff5);
        staff3.add(new StaffItem("이대리","대리",5));
        staff5.add(new StaffItem("김사원", "사원",2));
        staff5.add(new StaffItem("강사원", "사원",4));

        Waitress waitress=new Waitress(allStaff);
        waitress.printStaff();
        waitress.printTitle();
       // waitress.printWorkingYears();
    }
}
