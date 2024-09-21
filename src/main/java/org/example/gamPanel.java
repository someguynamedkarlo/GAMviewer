package org.example;

import javax.swing.JPanel;
import java.awt.*;

public class gamPanel extends JPanel {
    public gamPanel(int x) {
        this.setLayout(new GridLayout(x,1));
        this.setBackground(Color.BLACK);
        this.setVisible(true);
    }
}
