package org.example;

import javax.swing.JFrame;
import java.io.File;

public class FFrame extends JFrame {
   private gamPanel  gamPanel;
   private int nf;
   private buton[][] mreza;
    public FFrame() {
        File folder = new File(System.getProperty("user.dir"));
        String[] files = folder.list();
        nf = files.length;
        gamPanel = new gamPanel(nf);

        mreza = new buton[nf+1][1];
        for (int i = 0; i < nf; i++) {
            mreza[i+1][0] = new buton(files[i]);
            System.out.println(files[i]);
            gamPanel.add(mreza[i][0]);
        }

        this.add(gamPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("GAMviewer");
        this.setSize(1000, 900);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
