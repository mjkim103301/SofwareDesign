package Chap12_CompoundPattern;



public interface QuackObservable {
    public void registerObserver(Observer observer);//옵저버 등록하기 위한 메소드
    public void notifyObservers();//옵저버한테 연락을 돌리기 위한 메소드
}
