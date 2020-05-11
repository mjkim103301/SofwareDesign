package Chap12_CompoundPattern;

public class RedheadDuck implements Quackable {
    Observable observable;
    @Override
    public void quack() {//흰죽지오리
        System.out.println("흰죽지오리 꽥꽥");
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
