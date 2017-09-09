/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dan
 */
public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
    
    
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning){
        hours.setValue(hoursAtBeginning);
        minutes.setValue(minutesAtBeginning);
        seconds.setValue(secondsAtBeginning);
        
    }
    
    public void tick(){
        seconds.next();
    }
    
    
    public String toString(){
        return "";
    }
    
}
