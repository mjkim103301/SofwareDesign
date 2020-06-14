package FinalProjectTetris;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Ja extends JFrame implements ActionListener
{

    private int iCounter= 0,charge=0;
    private JButton button1;
    private JLabel label1;
    private JButton coffee,tea,can;

    public Ja()
    {

        setTitle( "자판기(By JG)" );
        setSize(300,100);

        JPanel north = new JPanel();

        coffee = new JButton("커피:200");
        coffee.setEnabled(false);
        coffee.addActionListener(this);
        tea = new JButton("국산차:200");
        tea.setEnabled(false);
        tea.addActionListener(this);
        can = new JButton("캔음료:500");
        can.addActionListener(this);
        can.setEnabled(false);

        north.add(coffee);
        north.add(tea);
        north.add(can);
        getContentPane().add("North", north);

        JPanel center = new JPanel();
        button1 = new JButton( "O원" );
        button1.setBounds( 100, 130, 100, 25 );
        button1.setEnabled(true);
        button1.addActionListener( this );
        center.add( button1 );
        getContentPane().add( "Center", center );

        this.addWindowListener( new WindowAdapter()
        {
            public void windowClosing( WindowEvent e )
            {
                System.exit( 0 );
            }
        } );
    }

    public void actionPerformed( ActionEvent e)
    {

        if( e.getSource() == button1 )
        {

            iCounter= iCounter+100;

            button1.setText( ""+iCounter+"원" );
            if(iCounter >=500){
                coffee.setEnabled( true );
                tea.setEnabled( true );
                can.setEnabled( true );
            }

            else if(iCounter>=200){
                coffee.setEnabled( true );
                tea.setEnabled( true );
            }

        }
        else if( e.getSource() == coffee ){
            if( iCounter >=200){
                iCounter = iCounter - 200;
                button1.setText(" " + iCounter + "원");
                System.out.println( "커피가 나왔습니다" );
                if(iCounter<200){
                    coffee.setEnabled( false );
                    tea.setEnabled( false );
                    can.setEnabled( false );
                }
                else if( iCounter<500){
                    can.setEnabled( false );
                }
            }
        }
        else if( e.getSource() == tea ){
            if( iCounter >=200){
                iCounter = iCounter - 200;
                button1.setText(" " + iCounter + "원");
                System.out.println( "국산차가 나왔습니다" );
                if( iCounter<200){
                    coffee.setEnabled( false );
                    tea.setEnabled( false );
                    can.setEnabled( false );
                }
                else if( iCounter<500){
                    can.setEnabled( false );
                }
            }
        }
        else if( e.getSource() == can ){
            if(iCounter >=500){
                iCounter = iCounter - 500;
                button1.setText(" " + iCounter + "원");
                System.out.println( "캔음료가 나왔습니다" );
                if(iCounter<200){
                    coffee.setEnabled( false );
                    tea.setEnabled( false );
                    can.setEnabled( false );
                }
                else if(iCounter<500){
                    can.setEnabled( false );
                }
            }
        }
    }

    public static void main( String args[] )
    {
        Ja mainFrame = new Ja();
        mainFrame.setVisible( true );
    }
}