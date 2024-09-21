package org.example;

import javax.swing.JButton;
import java.awt.*;

public class buton extends JButton {
    public buton(String tekst) {
        this.setText(tekst);
        this.setBounds(20,20,150,50);
        this.setBackground(Color.GRAY);
        this.setFont(new Font("Arial", Font.BOLD, 20));
        this.setVisible(true);
    }
}
