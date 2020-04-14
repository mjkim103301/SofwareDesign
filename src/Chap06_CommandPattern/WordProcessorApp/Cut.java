package Chap06_CommandPattern.WordProcessorApp;

import java.util.Scanner;
import java.util.Stack;

public class Cut {
    int startIndex, cutNum;

    Scanner scan=new Scanner(System.in);
    void setStart(){
        System.out.println("Please specify index where the cut must start:");
        startIndex=scan.nextInt();
        scan.nextLine();
        System.out.println("You chose start "+startIndex);

    }
    void setCutNum(){
        System.out.println("Please specify number of characters to be cut:");
        cutNum=scan.nextInt();
        scan.nextLine();
        System.out.println("You chose cut "+cutNum);
    }
    String start(Stack<String> stack){
        String front=stack.peek();
        String temp=front.substring(0,startIndex);
        temp+=front.substring(startIndex+cutNum);
        System.out.println(temp);
        return temp;
    }
}
