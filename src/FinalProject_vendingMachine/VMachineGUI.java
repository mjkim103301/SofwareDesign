package FinalProject_vendingMachine;

import FinalProject_vendingMachine.CommandPattern.VMCommand;
import FinalProject_vendingMachine.StatePattern.VMachine;
import FinalProject_vendingMachine.TemplatePattern.DrinkPrice;
import org.w3c.dom.Text;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VMachineGUI {

    int count=0;
    String show="";


    public VMachineGUI(){

        JFrame frame1=new JFrame("수제 음료 자판기 관리");
        frame1.setBounds(0,0,500,500);
        frame1.setBackground(Color.CYAN);
        Panel panel=new Panel();

        //폰트
        Font font=new Font(Font.SANS_SERIF, Font.PLAIN, 18);
        Font font1=new Font(Font.MONOSPACED, Font.BOLD, 22);

        //버튼
        Button onButton=new Button("VendingMachine ON");
        Button offButton=new Button("VendingMachine OFF");
        panel.add(onButton);
        panel.add(offButton);




        TextArea textArea=new TextArea("자판기 상태", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
        textArea.setText("자판기 상태\n\n");

        textArea.setBackground(Color.white);
        textArea.setEditable(false);
        textArea.setFont(font1);

        //frame1 컴포넌트
        frame1.add(panel, BorderLayout.CENTER);
        frame1.add(textArea,BorderLayout.SOUTH);
        frame1.setVisible(true);
        //---------------자판기 시작

        JFrame frame2=new JFrame("수제 음료 자판기");
        frame2.setBounds(0,0,1000,700);
        frame2.setBackground(Color.black);




        //상품 진열 프레임
        Panel product=new Panel();
     //   product.setBackground(new Color(255,255,215));
        product.setLayout(null);
        product.setSize(0,500);
        product.setFont(font);



        //상품 배열
        DrinkPrice[] drinks={
                new DrinkPrice("에스프레소", 3000),
                new DrinkPrice("카페라떼", 4000),
                new DrinkPrice("카라멜 \n마끼야또", 5000),

                new DrinkPrice("수박주스", 4500),
                new DrinkPrice("딸기주스", 4500),
                new DrinkPrice("사과주스", 4500)
        };
        JButton btn_drinks[]=new JButton[drinks.length];
        TextField txt_numDrinks[]=new TextField[drinks.length];
        Button minus[]=new Button[drinks.length];
        Button plus[]=new Button[drinks.length];
        JButton ok[]=new JButton[drinks.length];
        Label label_drinks[]=new Label[drinks.length];


        DefaultTableModel model=new DefaultTableModel();
        JTable ta=new JTable(model);

        model.addColumn("음료수명");
        model.addColumn("가격");
        model.addColumn("수량");
        model.addColumn("합계");


        ta.setBackground(Color.white);
        JScrollPane scrollPane=new JScrollPane(ta);


        TextArea ta2=new TextArea("주문 상태 나타내기", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
        ta2.setText("주문 조리 상태 \n");
        ta2.setBackground(Color.white);
        ta2.setEditable(false);

      //  scrollPane.add(ta2);
        //버튼 설정 부분
        for(int i=0;i<drinks.length;i++){
            btn_drinks[i] = new JButton(drinks[i].name);
            if (i < 3) {
                btn_drinks[i].setBounds(25 + i * 150, 50, 100, 100);
            } else {
                btn_drinks[i].setBounds(25 + (i - 3) * 150, 300, 100, 100);
            }


            // 숫자 txt 버튼
            txt_numDrinks[i] = new TextField("1");
            txt_numDrinks[i].setBackground(Color.white);
            txt_numDrinks[i].setEditable(false);
            txt_numDrinks[i].setBounds(btn_drinks[i].getX() + 30, btn_drinks[i].getY() + 130, 40, 20);

            // "-" 버튼
            minus[i] = new Button("-");
            minus[i].setBounds(btn_drinks[i].getX(), txt_numDrinks[i].getY(), 20, 20);
            minus[i].setEnabled(false);

            // "+" 버튼
            plus[i] = new Button("+");
            plus[i].setBounds(btn_drinks[i].getX() + (100 - 20), txt_numDrinks[i].getY(), 20, 20);
            plus[i].setEnabled(false);

            // 가격
            label_drinks[i] = new Label(drinks[i].price + "won");
            label_drinks[i].setBounds(btn_drinks[i].getX() + 20, txt_numDrinks[i].getY() - 25, 100, 20);

            // 확인 버튼
            ok[i] = new JButton("확인");
            ok[i].setBounds(btn_drinks[i].getX(), txt_numDrinks[i].getY() + 30, 100, 20);
            ok[i].setEnabled(false);

            product.add(btn_drinks[i]);
            product.add(txt_numDrinks[i]);
            product.add(minus[i]);
            product.add(plus[i]);
            product.add(label_drinks[i]);
            product.add(ok[i]);

        }

        Panel choice=new Panel();
        choice.setFont(font);
        choice.setBackground(new Color(255,255,215));

        Button btn_order=new Button("Order");
        Button btn_clear=new Button("Clear");
        Button btn_close=new Button("Close");
        choice.add(btn_order);
        choice.add(btn_clear);
        choice.add(btn_close);

        // 주문버튼
        btn_order.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,  " 주문되었습니다. \n이용해주셔서 감사합니다.");
                for (int i = 0; i < drinks.length; i++) {
                    btn_drinks[i].setEnabled(true);
                    minus[i].setEnabled(false);
                    plus[i].setEnabled(false);
                    txt_numDrinks[i].setText("0");
                }

                ta2.append("준비중인 음료: 에스프레서 커피 음료수\n");
                ta2.append("가격(원): 3000\n");
                ta2.append("주 재료: 원두\n");
                ta2.append("부가 재료들: 각설탕 3개 \n");
                ta2.append("컵에 커피와 부가 재료를 따르기 \n");
                ta2.append("주문이 완료됐습니다. \n");


           }
        });

        // 초기화 버튼
        btn_clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < drinks.length; i++) {
                    btn_drinks[i].setEnabled(true);
                    minus[i].setEnabled(false);
                    plus[i].setEnabled(false);
                    txt_numDrinks[i].setText("0");

                   model.setNumRows(0);
                    ta2.setText("주문 조리 상태\n\n");

                }
            }
        });


        //bt3 닫기버튼

        btn_close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        //frame2 컴포넌트
        frame2.add(product, BorderLayout.NORTH);
        frame2.add(scrollPane, BorderLayout.CENTER);
        frame2.add(choice, BorderLayout.SOUTH);
        frame2.add(ta2, BorderLayout.EAST);

        //on 버튼
        onButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //frame2.pack();
                for(int i=0;i< VMCommand.VMCommandAL_on.size();i++){
                    textArea.append(VMCommand.VMCommandAL_on.get(i)+"\n");
                }

                frame2.setVisible(true);

            }
        });

        //off버튼
        offButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for(int i=0;i< VMCommand.VMCommandAL_off.size();i++){
                    textArea.append(VMCommand.VMCommandAL_off.get(i)+"\n");
                }
            }
        });


        //버튼 이벤트들
        for(int i=0;i<drinks.length;i++){
            int j=i;

            //음료수 버튼 이벤트
            btn_drinks[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    minus[j].setEnabled(true);
                    plus[j].setEnabled(true);
                    btn_drinks[j].setEnabled(false);
                    ok[j].setEnabled(true);
                    count=0;
                }
            });

            // "-" 버튼 이벤트
            minus[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count > 1) {
                        count = count - 1;
                        txt_numDrinks[j].setText(count + "");
                        ok[j].setEnabled(true);
                    } else {
                        minus[j].setEnabled(false);
                    }
                }
            });

            // "+" 버튼 이벤트
            plus[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    count = count + 1;
                    txt_numDrinks[j].setText(count + "");
                    ok[j].setEnabled(true);
                    if (count > 0) {
                        minus[j].setEnabled(true);
                    }
                }
            });

            //확인 버튼 이벤트
            ok[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    show = btn_drinks[j].getActionCommand();
                    model.addRow(new Object[]{show, String.valueOf(drinks[j].price), String.valueOf(count), drinks[j].price * count + "원"});
                    //contents[row++]= new String[]{show, String.valueOf(drinks[j].price), String.valueOf(count), drinks[j].price * count + "원"};
                 //   ta.append(" " + show + "    " + drinks[j].price + "   " + count + "     " + drinks[j].price * count + "원" + "\n");
                    ok[j].setEnabled(false);

                }
            });
        }


    }

}
