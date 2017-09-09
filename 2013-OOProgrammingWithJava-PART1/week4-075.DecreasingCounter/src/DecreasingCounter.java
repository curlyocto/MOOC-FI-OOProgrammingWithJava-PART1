public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        initialValue= valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if(value > 0){
       value--; // decrease value by one
        }
        
    }

    // and here the rest of the methods
    
    public void reset(){
        value = 0; //r////////////////.//reset the value to zero
    
    
    
    }
    
    public void setInitial(){
     value = initialValue;   
    }
    
    
}
