package Chap04_FactoryPattern.DocumentOutputApp;

import java.util.Deque;
import java.util.Queue;

public class BigType extends Document {
    String output;

    @Override
    public void makeDisplay(Deque<String> queue) {
        output= (String) queue.poll();
        System.out.println("Option 1");
        System.out.println("----Title: "+output.toUpperCase()+"-----");
        int sectionNum=1;
        while(!queue.isEmpty()){
            output=(String )queue.poll();
            System.out.println("Section "+sectionNum+". ---"+output.toUpperCase()+"---");
            System.out.println(queue.poll());
            sectionNum++;
        }

    }
}
