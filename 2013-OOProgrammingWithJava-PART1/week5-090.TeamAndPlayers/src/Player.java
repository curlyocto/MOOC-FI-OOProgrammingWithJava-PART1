/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dan
 */
public class Player {
    
    private String playerName;
    private int goals;
    
    
    public Player(String name){
        this.playerName = name;
    }
    
    public Player(String name, int goals){
        this.playerName = name;
        this.goals = goals;
    }
    
    public String getName(){
        return playerName;
    }
    
    public int goals(){
        return goals;
    }
    
    public String toString(){
      return playerName + "," + " goals " + goals;   
    }
    
}
