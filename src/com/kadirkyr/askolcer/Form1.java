package com.kadirkyr.askolcer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame{
    private JPanel panel1;
    private JTextField maleText;
    private JTextField femaleText;
    private JButton button1;
    private JLabel maleLbl;
    private JLabel femaleLbl;
    private JLabel resultLbl;

    Form1(){init();

    }

    public void init(){
        add(panel1);
        setTitle("Aşk Ölçer");
        setSize(450,450);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String maleName = maleText.getText();
            String femaleName = femaleText.getText();
            String result = null;

                if (femaleName.length() == maleName.length()){
                   result = "%100 Uyumlu bir çift <3<3<3";
                } else if (femaleName.length() > 7 && maleName.length() > 7 ) {
                    result = "%90 Uyumlu bir çift <3<3<3";
                }
                else if (femaleName.length() <= 5 && maleName.length() <= 5 ) {
                    result = "%85 Uyumlu bir çift <3<3<3";
                }
                else if ((femaleName.length() > 5 && maleName.length() <= 5) || (femaleName.length() <= 5 && maleName.length() > 5 )) {
                    result = "%70 Uyumlu bir çift <3<3<3";
                } else if ((femaleName.length() > 7 && maleName.length() < 5) || (maleName.length() > 7 && femaleName.length() < 5)) {
                    result = "%60 Uyumlu bir çift <3<3<3";
                }
            
                resultLbl.setText(result);
                
            }
        });
    }
}
