/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dartapplication;

import java.util.*;

/**
 *
 * @author Yogi
 * Klasa Gracza
 */
public class Player {
    
    // Konstrukcja
    public Player(){};
    public Player(String ... argv){
    
        if(!argv[0].isEmpty()) this.firstname = argv[0];
        if(!argv[1].isEmpty()) this.lastname = argv[1];
        if(!argv[2].isEmpty()) this.nickname = argv[2];
        if(!argv[3].isEmpty()) this.city = argv[3];
        
    };
    public Player(String nickname){
        this.nickname = nickname;
    }
    
    // Zmienne
    private String firstname;       // imię
    private String lastname;        // nazwisko
    private int id;                 // numer id
    private String nickname;        // pseudonim
    private String city;          // miasto
    private StatisticPlayer stat;   // statystyka

    
    //Settery i gettery
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public StatisticPlayer getStat() {
        return stat;
    }

    public void setStat(StatisticPlayer stat) {
        this.stat = stat;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    
    
    // Metody
    
    public String toString(){
       String s;
//       if(!firstname.isEmpty()) s = firstname + " ";
       s = nickname;
  //     if(!lastname.isEmpty()) s = " " + lastname;      
       return s;
    }
      
}
