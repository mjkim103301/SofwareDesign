package Chap04_FactoryPattern.DocumentOutputApp;
import java.util.Scanner;
public class DocumentOutputDriver {
    public static void main(String []args){
        Document document;
        String title;
        String heading,text, type;
        Scanner scanner=new Scanner(System.in);
        title=scanner.nextLine();
        while(true){
            heading=scanner.nextLine();
            if(heading.equals("done"))break;
            text=scanner.next();
            //document=new createDocument(heading, text);

        }
        System.out.println("Enter the style you want displayed:");
        type=scanner.next();
        //makeDisplay(type);
    }
}
