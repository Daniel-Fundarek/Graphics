package sk.stuba.fei.uim.oop;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300, 300);
        JPanel panel = new JPanel();
        okno.add(panel);
        JLabel label = new JLabel("Hello world");
        panel.add(label);
        for (int i = 0;i<10 ; i++){
            panel.add(new JLabel("" + i));
        }

    }
}
