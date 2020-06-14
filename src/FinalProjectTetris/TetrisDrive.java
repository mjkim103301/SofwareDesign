package FinalProjectTetris;

import javax.swing.*;

public class TetrisDrive extends JFrame {

    public static void main(String[] args){
        new TetrisDrive();
    }
    public TetrisDrive(){
        super("테트리스 게임");
        setBounds(100,100,800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
