package Chap06_CommandPattern;

public class Light2 {
    String light;
    Light2(String light){
        this.light=light;
    }
    void on(){
        System.out.println(light+" light on");
    }

    void off() {
        System.out.println(light+ " light off");
    }
}
