package Chap06_CommandPattern.WordProcessorApp;

import java.util.Scanner;
import java.util.Stack;

public class Paste {
    int startIndex;
    String insert;
    Scanner scan=new Scanner(System.in);

    void setStart(){
        System.out.println("Please specify index where the paste must start:");
        startIndex=scan.nextInt();
        scan.nextLine();
        System.out.println("You chose start "+startIndex);

    }
    void setInsertString(){
        System.out.println("Please specify text to be inserted: ");
        scan.reset();
        insert=scan.nextLine();
    }
    String start(Stack<String> stack){
        String temp="";
        if(stack.empty()){
            temp+=insert;

        }
        else{
            String front=stack.peek();
            temp+=front.substring(0,startIndex);
            temp+=insert;
            temp+=front.substring(startIndex);
        }
        System.out.println(temp);
        return temp;
    }
}
