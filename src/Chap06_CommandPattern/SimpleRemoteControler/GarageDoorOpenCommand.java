package Chap06_CommandPattern.SimpleRemoteControler;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;
    GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor=garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.open();
    }
}
