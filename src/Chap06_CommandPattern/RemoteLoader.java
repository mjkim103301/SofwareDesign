package Chap06_CommandPattern;

public class RemoteLoader {
    public static void main(String[]args){
        RemoteControl remoteControl=new RemoteControl();

        Light2 livingRoomLight=new Light2("Living Room");
        Light2 kitchenLight=new Light2("Kitchen");
        Stereo stereo=new Stereo("Living Room");

        LightOnCommand2 livingRoomLightOn=new LightOnCommand2(livingRoomLight);
        LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);

        LightOnCommand2 kitchenLightOn=new LightOnCommand2(kitchenLight);
        LightOffCommand kitchenLightOff=new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCD=new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD=new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOffWithCD);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
    }
}
