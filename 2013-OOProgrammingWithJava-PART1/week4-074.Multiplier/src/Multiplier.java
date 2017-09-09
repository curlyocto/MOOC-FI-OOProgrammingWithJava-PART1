/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dan
 */
public class Multiplier {
    
    private int number;
    //private int otherNumber;
    
    
    public Multiplier(int number){
        this.number = number;
    }
    
    
    public int multiply(int otherNumber){
        int multiplied = number * otherNumber;
        
        return multiplied;
    }
}
