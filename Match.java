/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dartapplication;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Yogi
 */
public class Match {
    
    private int id_match;
    private Player player1;
    private Player player2;
    private Player marker;
   

    Match(int id, Player ... pl){
        this.id_match = id;
        this.player1 = pl[0];
        this.player2 = pl[1];
        if(pl.length == 3){
            this.marker = pl[2];
        }
    }
   
    public int getId_match() {
        return id_match;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getMarker() {
        return marker;
    }

    public void setMarker(Player marker) {
        this.marker = marker;
    }
    
    public Player getWinner(){
        if(player1.getStat().getWinleg() < player2.getStat().getWinleg())
            return player2;
        else 
            return player1;
    }

    @Override
    public String toString() {
        return "Match{" + "id_match=" + id_match + ", player1=" + player1 + ", player2=" + player2 + ", marker=" + marker + '}';
    }
    
    
    
}
