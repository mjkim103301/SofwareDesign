package Chap06_CommandPattern;

public class RemoteControler {
    public static void main(String [] args){
        SimpleRemoteControl remote=new SimpleRemoteControl();
        Light light=new Light();
        LightOnCommand lightOn=new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
