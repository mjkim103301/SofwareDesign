package Chap08_TemplateMethodPattern;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    String message;
    public void init(){
        message="안녕하세요. 제가 왔어요...";
        repaint();
    }
    public void start(){
        message="시작중...";
        repaint();
    }
    public void stop(){
        message="저를 떠나려 하시는군요...";
        repaint();
    }
    public void destroy(){
        message="애플릿 제거됨";
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(message, 5, 15);
    }


}
