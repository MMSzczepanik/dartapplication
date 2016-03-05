/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dartapplication;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Yogi
 */
public class GeneratorMatchPanel {
    
    public static void generateSKOMatch(int posX, int posY, JPanel panel, Match match){
        MatchPanel matchpanel = new MatchPanel(posX,posY,match);
       //JButton matchpanel = new JButton("Yogi");
        panel.add(matchpanel);
        matchpanel.setVisible(true);
       // matchpanel.setLocation(posX, posY);
        matchpanel.setSize(50, 50);
        //panel.repaint();
    }
    
}
