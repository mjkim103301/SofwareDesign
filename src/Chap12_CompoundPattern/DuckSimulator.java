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
        //Quackable mallarDuck=duckFactory.createMallardDuck();
        Quackable redheadDuck=duckFactory.createRedheadDuck();
        Quackable duckCall=duckFactory.createDuckCallDuck();
        Quackable rubberDuck=duckFactory.createRubberDuck();
        Quackable gooseDuck=new GooseAdaptor(new Goose());
  /*      simulate(mallarDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);*/
        System.out.println("\n Duck Simulator : With Composite - Flocks ");
        Flock flockOfDucks=new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards =new Flock();
        Quackable mallar1=duckFactory.createMallardDuck();
        Quackable mallar2=duckFactory.createMallardDuck();
        Quackable mallar3=duckFactory.createMallardDuck();
        flockOfMallards.add(mallar1);
        flockOfMallards.add(mallar2);
        flockOfMallards.add(mallar3);
        flockOfDucks.add(flockOfMallards);
        System.out.println("\n Duck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\n Duck Simulator: Mallard FLock Simulation");
        simulate(flockOfMallards);
        
        System.out.println("The ducks quacked "+QuackCounter.getQuacks()+" times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
