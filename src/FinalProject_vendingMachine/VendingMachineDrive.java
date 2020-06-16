package FinalProject_vendingMachine;


import FinalProject_vendingMachine.CommandPattern.RemoteControl;
import FinalProject_vendingMachine.CommandPattern.VMCommand;
import FinalProject_vendingMachine.CommandPattern.VMOffCommand;
import FinalProject_vendingMachine.CommandPattern.VMOnCommand;
import FinalProject_vendingMachine.FactoryMethodPattern.CoffeeDrinkStore;
import FinalProject_vendingMachine.FactoryMethodPattern.Drink;
import FinalProject_vendingMachine.FactoryMethodPattern.DrinkStore;
import FinalProject_vendingMachine.FactoryMethodPattern.JuiceDrinkStore;
import FinalProject_vendingMachine.StatePattern.VMachine;

import java.rmi.Remote;

public class VendingMachineDrive {
    public static void main(String[]args) {
        RemoteControl remoteControl=new RemoteControl();
        VMCommand N4VM = new VMCommand("N4동 자판기");
        VMCommand N5VM = new VMCommand("N5동 자판기");

        VMOnCommand N4VM_ON=new VMOnCommand(N4VM);
        VMOffCommand N4VM_OFF=new VMOffCommand(N4VM);
        VMOnCommand N5VM_ON=new VMOnCommand(N5VM);
        VMOffCommand N5VM_OFF=new VMOffCommand(N5VM);

        remoteControl.setCommand(0, N4VM_ON, N4VM_OFF);
        remoteControl.setCommand(1, N5VM_ON, N5VM_OFF);

        DrinkStore coffeeStore=new CoffeeDrinkStore();
        DrinkStore juiceStore=new JuiceDrinkStore();
        //영업 시작
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);

        VMachine vMachine=new VMachine(10);
        System.out.println(vMachine);

        vMachine.insertQuarter(5000);
        vMachine.chooseDrink();
        Drink drink=coffeeStore.orderDrink("Espresso");
        vMachine.releaseDrink();
        System.out.println("Minji ordered a "+drink.getName()+"\n");

        vMachine.ejectQuarter();
        //영업 종료
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
    }
}
