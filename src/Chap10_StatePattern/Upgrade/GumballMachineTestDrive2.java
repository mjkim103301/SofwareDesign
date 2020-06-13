package Chap10_StatePattern.Upgrade;

import Chap10_StatePattern.GumballMachine;

public class GumballMachineTestDrive2 {
    public static void main(String[] args){
        GumballMachine2 gumballMachine2=new GumballMachine2(5);
        System.out.println(gumballMachine2);

        gumballMachine2.insertQuarter();
        gumballMachine2.turnCrank();

        System.out.println(gumballMachine2);

    }
}
