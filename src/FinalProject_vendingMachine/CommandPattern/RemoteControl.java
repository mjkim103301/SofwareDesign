package FinalProject_vendingMachine.CommandPattern;


public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(){
        onCommands=new Command[5];
        offCommands=new Command[5];

        Command noCommand=new NoCommand();
        for(int i=0;i<5;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
    }
    public void setCommand(int slot, Command onCommand, Command offCommand ){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();

    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }
}
