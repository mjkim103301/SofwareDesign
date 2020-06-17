package FinalProject_vendingMachine.CommandPattern;

import FinalProject_vendingMachine.StatePattern.VMachine;

import java.awt.*;
import java.util.ArrayList;

public class VMCommand {

    String vending_machine;
   public static ArrayList<String> VMCommandAL_on=new ArrayList<>();
    public static ArrayList<String> VMCommandAL_off=new ArrayList<>();
    int volume;
    public VMCommand(String VM){
        this.vending_machine=VM;
    }
    void on(){
        VMCommandAL_on.add(vending_machine+ " 가게 불 켜기");
        VMCommandAL_on.add(vending_machine+ " 자판기 가동시키기");
        VMCommandAL_on.add(vending_machine+ " 스피커 on");

        System.out.println(vending_machine+ " 가게 불 켜기");
        System.out.println(vending_machine+ " 자판기 가동시키기");
        System.out.println(vending_machine+ " 스피커 on");
    }

    void off() {
        VMCommandAL_off.add(vending_machine+ " 가게 불 끄기");
        VMCommandAL_off.add(vending_machine+ " 자판기 종료하기");
        VMCommandAL_off.add(vending_machine+ " 스피커 off");

        System.out.println(vending_machine+ " 가게 불 끄기");
        System.out.println(vending_machine+ " 자판기 종료하기");
        System.out.println(vending_machine+ " 스피커 off");
    }
    void setVolume(int volume){
        this.volume=volume;
        VMCommandAL_on.add(vending_machine+ "배경음악 크기: "+volume+"으로 조정\n");
        System.out.println(vending_machine+ "배경음악 크기: "+volume+"으로 조정");
    }
}
