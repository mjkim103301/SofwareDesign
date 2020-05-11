package Chap12_CompoundPattern;



public class MallardDuck implements Quackable {
    Observable observable;
    @Override
    public void quack() {//표준적인 물오리
        System.out.println("오리 꽥꽥");
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
