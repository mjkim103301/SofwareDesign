package Chap06_CommandPattern.WordProcessorApp;

import java.util.Scanner;

public class Cut {
    int startIndex, cutNum;

    Scanner scan=new Scanner(System.in);
    void setStart(){
        System.out.println("Please specify index where the cut must start:");
        startIndex=scan.nextInt();
        System.out.println("You chose start "+startIndex);

    }
    void setCutNum(){
        System.out.println("Please specify number of characters to be cut:");
        cutNum=scan.nextInt();
        System.out.println("You chose cut "+cutNum);
    }
    String start(String target){
        String temp=target.substring(0,startIndex);
        temp+=target.substring(startIndex+cutNum);
        return temp;
    }
}
