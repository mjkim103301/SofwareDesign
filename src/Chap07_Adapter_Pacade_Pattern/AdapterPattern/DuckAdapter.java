package Chap07_Adapter_Pacade_Pattern.AdapterPattern;

public class DuckAdapter implements Turkey {
    Duck duck;
    public DuckAdapter(Duck duck){
        this.duck=duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
       duck.fly();
       System.out.println("fling/5");

    }
}
