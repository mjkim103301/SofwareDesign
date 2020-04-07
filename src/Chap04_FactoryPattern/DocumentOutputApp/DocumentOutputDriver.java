package Chap04_FactoryPattern.DocumentOutputApp;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class DocumentOutputDriver {
    public static void main(String []args){
        Deque<String> queue = new ArrayDeque<String>();
        Document document = null;
        String title;
        String heading,text, type;
        System.out.println("---> Enter title: ");

        Scanner scanner=new Scanner(System.in);
        queue.offer(scanner.nextLine());
       // title=scanner.nextLine();
        document.createDocument(title);
        while(true){
            System.out.println("---> Enter Heading or 'done': ");

            heading=scanner.nextLine();
            if(heading.equals("done"))break;
            System.out.println("---> Enter text: ");
            text=scanner.nextLine();
            document.createDocument(heading, text);

        }
        System.out.println("Enter the style you want displayed:");
        type=scanner.next();
        if(type.equals("big")){
            document=new BigType();
            document.makeDisplay();
        }else if(type.equals("small")){
            document=new SmallType();
            document.makeDisplay();
        }
    }
}
