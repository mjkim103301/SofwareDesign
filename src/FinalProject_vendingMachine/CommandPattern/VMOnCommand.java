package FinalProject_vendingMachine.CommandPattern;

public class VMOnCommand implements Command {
    VMCommand vmCommand;
    public VMOnCommand(VMCommand vmCommand){
        this.vmCommand=vmCommand;
    }
    @Override
    public void execute() {
        vmCommand.on();
        vmCommand.setVolume(10);
    }

    @Override
    public void undo() {
        vmCommand.off();

    }
}
