package Chap12_CompoundPattern;

public class RubberDuck implements Quackable {
    Observable observable;
    @Override
    public void quack() {//고무오리
        System.out.println("고무오리 삑삑");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
