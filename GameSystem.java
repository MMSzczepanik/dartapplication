/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dartapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Yogi
 */
public abstract class GameSystem {
    
    protected List<Player> playerslist = new ArrayList<Player>();
    protected List<Match> matchlist = new ArrayList<Match>();
    protected List<Integer> boardlist = new ArrayList<Integer>();
    
    protected void shuffle(){
        Collections.shuffle(playerslist);
    }
    
    public void addPlayer(Player pl){
        playerslist.add(pl);
    }
    
    public void removePlayer(Player pl){
        playerslist.remove(pl);
    }
    
    public int getSizeTournament(){
        return playerslist.size();
    }

    public List<Player> getPlayerslist() {
        return playerslist;
    }

    public void setPlayerslist(List<Player> playerslist) {
        this.playerslist = playerslist;
    }

    public List<Match> getMatchlist() {
        return matchlist;
    }

    public void setMatchlist(List<Match> matchlist) {
        this.matchlist = matchlist;
    }
 
    public abstract void startTournament();
    public abstract void generateMatches();
    
}
