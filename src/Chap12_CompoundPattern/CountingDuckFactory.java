package Chap12_CompoundPattern;

public class CountingDuckFactory extends AbstractDuckFactory {
/*    Quackable mallarDuck=new QuackCounter(new MallardDuck());
    Quackable redheadDuck=new QuackCounter(new RedheadDuck());
    Quackable duckCall=new QuackCounter(new DuckCall());
    Quackable rubberDuck=new QuackCounter(new RubberDuck());
    Quackable gooseDuck=new GooseAdaptor(new Goose());*/
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCallDuck() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
