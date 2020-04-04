package Chap05_SingletonPattern;
//BasicSingleton에 synchronized 만 추가하여 동기화 시켰다.
//오류는 방지할 수 있으나, 속도가 느리다.
public class UpgradeSingleton {
    private static UpgradeSingleton uniqueInstance;
    private UpgradeSingleton(){
    }
    public static synchronized UpgradeSingleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new UpgradeSingleton();
        }
        return uniqueInstance;
    }
}
