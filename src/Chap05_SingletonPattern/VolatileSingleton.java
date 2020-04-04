package Chap05_SingletonPattern;
//UpgradeSingleton의 개선방법2
//volatile을 사용하여 객체가 NULL일 때만 동기화를 하고 객체를 생성한다. 
public class VolatileSingleton {
    private volatile static VolatileSingleton uniqueInstance;
    private VolatileSingleton(){
    }
    public static synchronized VolatileSingleton getInstance(){
        if(uniqueInstance==null) {
            synchronized (VolatileSingleton.class) {
                uniqueInstance = new VolatileSingleton();
            }
        }
        return uniqueInstance;
    }
}
