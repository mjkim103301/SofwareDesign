package Chap06_CommandPattern.WordProcessorApp;

import java.util.Scanner;

public class AppLoader {
    public static void main(String [] args){
        int command;
        Scanner scan=new Scanner(System.in);
        AppRemoteControl remoteControl=new AppRemoteControl();
        Cut cut=new Cut();
        Paste paste=new Paste();
        cutCommand cutCommand=new cutCommand(cut);
        pasteCommand pasteCommand=new pasteCommand(paste);
        while(true){
            System.out.println("pick number from one of the following:");
            System.out.println("1. undo");
            System.out.println("2. paste");
            System.out.println("3. cut");
            System.out.println("4. quit");
            command=scan.nextInt();
            if(command==4)break;
            else if(command==1){
                remoteControl.undoButtonWasClicked();
            }
            else if(command==2){
                remoteControl.setCommand(2,pasteCommand);
                remoteControl.buttonWasCLicked(2);
            }
            else if(command==3){
                remoteControl.setCommand(3,cutCommand);
                remoteControl.buttonWasCLicked(3);
            }
        }
    }
}
