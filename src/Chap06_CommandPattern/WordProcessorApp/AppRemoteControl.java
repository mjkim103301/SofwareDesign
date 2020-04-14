package Chap06_CommandPattern.WordProcessorApp;

import java.util.Stack;

public class AppRemoteControl {
    AppCommand[] clickedCommands;
    AppCommand undoCommand;
    Stack<String> stack=new Stack<>();
    public AppRemoteControl(){
        clickedCommands=new AppCommand[5];
        AppCommand noCommand=new NoCommand();
        for(int i=0;i<5;i++){
            clickedCommands[i]=noCommand;
        }
        undoCommand=noCommand;

    }
    public void setCommand(int slot, AppCommand clickedCommand){
        clickedCommands[slot]=clickedCommand;

    }
    public void buttonWasCLicked(int slot){
        //clickedCommands[slot].setString();
        clickedCommands[slot].execute(stack);
        undoCommand=clickedCommands[slot];
    }
    public void undoButtonWasClicked(){
        undoCommand.undo();
    }
}
