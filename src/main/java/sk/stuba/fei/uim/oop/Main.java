package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300, 300);

        JPanel panel = new JPanel();
        okno.add(panel);

        var panelLayout = new GridLayout(4,4);
        panel.setLayout(panelLayout);

        JLabel label = new JLabel("Hello world");
        panel.add(label);

        var panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,2));

        for(int i = 0; i<5; i++){
            panel2.add(new JLabel("a"+ i));

        }

        for (int i = 0;i<12 ; i++){
            if(i == 8){
                panel.add(panel2);
            }
            else {
                panel.add(new JLabel("" + i));
            }
        }
    }
}
