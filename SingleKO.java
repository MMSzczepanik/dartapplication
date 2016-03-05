/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dartapplication;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;

/**
 *
 * @author Yogi
 */
public class SingleKO extends GameSystem {
    
    public SingleKO(JPanel panel){
        this.panel = panel;
    }
    
    private int realsize = makeRealSize();
    
    private int makeRealSize(){                 // zwraca najbliższą wielokrotność 2
        int realsize=1;
        while(getSizeTournament()> realsize){
           realsize = realsize << 1;
           
        }
        System.out.println("Realsize: "+ realsize);
        return realsize;
    }
    
    private void addFree(){                     // uzupełnia playerslist o zawodników FREE
        while(getSizeTournament()<makeRealSize()){
            this.addPlayer(new Player("FREE"));
        }
    }
    
    public void generateMatches(){
        for(int i=0; i<getSizeTournament(); i=i+2){   
            matchlist.add(new Match(i/2+1, this.playerslist.get(i),this.playerslist.get(i+1)));
            panel.setLayout(new GridLayout(i/2+1,1));
           //panel.setLayout(new ScrollPaneLayout());
            GeneratorMatchPanel.generateSKOMatch(i, i*300, panel, matchlist.get(matchlist.size()-1));
            System.out.println("Stworzyłem panel: " + (i/2+1));
        }
    }

    @Override
    public void startTournament() {
        
        this.addFree();
        this.shuffle();
        this.generateMatches();
         
    }
    
    private JPanel panel;
    
}
