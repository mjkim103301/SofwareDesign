package FinalProject_vendingMachine.CommandPattern;

public class VMOffCommand implements Command{
    VMCommand vmCommand;

    public VMOffCommand(VMCommand vmCommand){
        this.vmCommand=vmCommand;
    }
    @Override
    public void execute() {
        vmCommand.off();
    }

    @Override
    public void undo() {
        vmCommand.on();
        vmCommand.setVolume(10);
    }
}
