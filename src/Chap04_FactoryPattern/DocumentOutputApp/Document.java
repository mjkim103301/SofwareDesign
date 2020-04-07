package Chap04_FactoryPattern.DocumentOutputApp;

import java.util.*;

public abstract class Document {
   // String title;
    //String heading;
    //String text;
   //Deque<String> queue = new ArrayDeque<String>();
   /* public void createDocument(String title){
        queue.add(title);
    }
    public void createDocument(String heading, String text){
        queue.add(heading);
        queue.add(text);

    }*/
    public abstract void makeDisplay(Deque<String> queue);

}
