package org.example;

import javax.swing.JFrame;

public class FFrame extends JFrame {
   private gamPanel  gamPanel;
    public FFrame() {
        gamPanel = new gamPanel();
        this.add(gamPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GAMviewer");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
