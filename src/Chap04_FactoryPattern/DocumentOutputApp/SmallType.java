package Chap04_FactoryPattern.DocumentOutputApp;

import java.util.Queue;

public class SmallType extends Document {

    @Override
    public void makeDisplay() {
        System.out.println(queue.poll()+"\n");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
            System.out.println(queue.poll()+"\n");
        }
    }
}
