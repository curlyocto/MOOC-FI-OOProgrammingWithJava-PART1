/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dan
 */
public class Counter {
    
    private int startingValue;
    private boolean check;
   
    
     public Counter(){
        this(0,false);
    }
    
    public Counter(int startingValue, boolean check){
        if(check){
        this.check = true;
        }
        this.startingValue = startingValue;
    }
    
    public Counter(int startingValue){
      this(startingValue,false);
    }
    
    public Counter(boolean check){
        if(check){
        this.check = true;
        }
        this.startingValue = 0;
    }
    
   
    public int value(){
        
        return startingValue;
    }
    
    public void increase(){
        startingValue++;
    }
    
    public void decrease(){
      
        startingValue--;
    
    
        if(check && (startingValue < 0)){
           startingValue = 0;
            
        }
    }
    
    public void increase(int increaseAmount){
        if(increaseAmount > 0){
            startingValue += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount){
        
          if(decreaseAmount > 0 ){
            startingValue -= decreaseAmount;
        }
        
         if(check && (startingValue < 0)){
           startingValue = 0;
            
        }
      
        
       
        
    }
}
