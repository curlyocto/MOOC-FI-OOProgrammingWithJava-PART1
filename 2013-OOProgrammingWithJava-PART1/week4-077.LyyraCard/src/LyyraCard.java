/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dan
 */
public class LyyraCard {
    private double balance;
    
    
    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart;
        
    }
    
    public void payEconomical(){
        if(balance >= 2.50){
        balance-=2.50;
    }
    }
    public void payGourmet(){
        if(balance >= 4.0){
        balance-=4.0;
    }
    }
    
    
    public void loadMoney(double amount){
        int max = 150;
        if(amount >= 0){
        balance+=amount;
        
        }
        
        if(balance > max){
            balance = max;
        }
    }
    
    public String toString(){
        return "The card has " + balance + " euros";
        
    }
    
    
}
