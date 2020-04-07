package Chap04_FactoryPattern.DocumentOutputApp;

import java.util.Deque;
import java.util.Queue;

public class BigType extends Document {
    String output;

    @Override
    public void makeDisplay(Deque<String> queue) {
        output= (String) queue.peek();
        output.toUpperCase();
        queue.poll();
        System.out.println("----Title: "+output+"-----");
        while(!queue.isEmpty()){
            int sectionNum=1;
            output=(String )queue.peek();
            output.toUpperCase();
            queue.poll();
            System.out.println("Section "+(sectionNum++)+". ---"+output+"---");
            System.out.println(queue.poll());
        }

    }
}
