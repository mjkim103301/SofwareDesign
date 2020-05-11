package Chap12_CompoundPattern;

import Chap08_TemplateMethodPattern.Sort.Duck;

public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator simulator=new DuckSimulator();
        AbstractDuckFactory duckFactory=new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory){
/*        Quackable mallarDuck=new QuackCounter(new MallardDuck());
        Quackable redheadDuck=new QuackCounter(new RedheadDuck());
        Quackable duckCall=new QuackCounter(new DuckCall());
        Quackable rubberDuck=new QuackCounter(new RubberDuck());
   */
        Quackable mallarDuck=duckFactory.createMallardDuck();
        Quackable redheadDuck=duckFactory.createRedheadDuck();
        Quackable duckCall=duckFactory.createDuckCallDuck();
        Quackable rubberDuck=duckFactory.createRubberDuck();
        Quackable gooseDuck=new GooseAdaptor(new Goose());

        System.out.println("\n Duck Simulator : With Decorator ");
        simulate(mallarDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked "+QuackCounter.getQuacks()+" times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
