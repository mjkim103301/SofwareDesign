package Chap12_CompoundPattern;

public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator simulator=new DuckSimulator();
        simulator.simulate();
    }
    void simulate(){
        Quackable mallarDuck=new MallardDuck();
        Quackable redheadDuck=new RedheadDuck();
        Quackable duckCall=new DuckCall();
        Quackable rubberDuck=new RubberDuck();
        Quackable gooseDuck=new GooseAdaptor(new Goose());

        System.out.println("\n Duck Simulator ");
        simulate(mallarDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
