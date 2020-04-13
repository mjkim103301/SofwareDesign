package Chap06_CommandPattern;

public class RemoteControl {
    Command2[] onCommands;
    Command2[] offCommands;
    public RemoteControl(){
        onCommands=new Command2[7];
        offCommands=new Command2[7];

        Command2 noCommand=new NoCommand();
        for(int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
    }

    public void setCommand(int slot, Command2 onCommand, Command2 offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    public String toString(){
        StringBuffer stringBuff=new StringBuffer();
        stringBuff.append("\n----- Remote Control-----\n");
        for(int i=0;i<onCommands.length;i++){
            stringBuff.append("[slot"+i+"]"+onCommands[i].getClass().getName()+"  "+offCommands[i].getClass().getName()+"\n");

        }
        return stringBuff.toString();
    }
}
