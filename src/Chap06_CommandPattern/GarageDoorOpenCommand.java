package Chap06_CommandPattern;

public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;
    GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor=garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.open();
    }
}
