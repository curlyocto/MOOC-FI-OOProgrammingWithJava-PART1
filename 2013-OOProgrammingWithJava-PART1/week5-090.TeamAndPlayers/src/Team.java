
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dan
 */
public class Team {
    
    private String teamName;
    private ArrayList<Player> players= new ArrayList<Player>();
   // private int teamSize;
    private int maxSize;
    
    public Team(String name){
        this.teamName = name;
        this.maxSize = 16;
    }
    
    
    public void addPlayer(Player player){
        
       if(players.size() < maxSize){
       
       players.add(player);
        
       }
       
      
        
    }
    
    public void printPlayers(){
        for(Player s: players){
            System.out.println(s);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return players.size();
    }
    
    public String getName(){
        return this.teamName;
    }
    
    
    public int goals(){
     int goals = 0;
        for(Player g: players){
          goals += g.goals();
        }
        return goals;
        
    }
    
    
}
