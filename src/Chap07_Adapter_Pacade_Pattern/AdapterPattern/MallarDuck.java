package Chap07_Adapter_Pacade_Pattern.AdapterPattern;

public class MallarDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Qauck");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
