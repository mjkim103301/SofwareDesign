package Chap06_CommandPattern;

public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
