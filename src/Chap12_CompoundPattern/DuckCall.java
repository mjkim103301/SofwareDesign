package Chap12_CompoundPattern;

public class DuckCall implements Quackable {
    Observable observable;
    @Override
    public void quack() {//사냥꾼들이 오리 찾을 때 쓰는 오리소린 나오는 기계
        System.out.println("사냥꾼 꽉");
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
