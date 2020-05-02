package Chap08_TemplateMethodPattern;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }
    public void paint(Graphics graphics){//후크 메소드
        super.paint(graphics);
        String msg="내가 최고!!";
        graphics.drawString(msg, 100,100);
    }
    public static void main(String [] args){
        MyFrame myFrame=new MyFrame("헤드 퍼스트 디자인 패턴");

    }

}
