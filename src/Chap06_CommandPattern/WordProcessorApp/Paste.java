package Chap06_CommandPattern.WordProcessorApp;

import java.util.Scanner;

public class Paste {
    int startIndex;
    String insert=null;

    Scanner scan=new Scanner(System.in);
    void setStart(){
        System.out.println("Please specify index where the paste must start:");
        startIndex=scan.nextInt();
        System.out.println("You chose start "+startIndex);

    }
    void setInsertString(){
        System.out.println("Please specify text to be inserted: ");
        insert=scan.nextLine();
    }
    String start(String target){
        String temp="";
        if(startIndex>0){
            temp=target.substring(0,startIndex);
        }
        temp+=insert;
        temp+=target.substring(startIndex);
        return temp;
    }
}
