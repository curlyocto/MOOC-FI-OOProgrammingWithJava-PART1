import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
      
        // Write your code here
        int sum = 0;
        for(Integer num: list){
            sum+=num;
        }
        
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
         double avg = 0;
        
        avg = (double)sum(list) / list.size();
            
        return avg;
    
        
      
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double var = 0.0;
        double varBuffer = 0.0;
        double avg = average(list);
       
        
        //double avg = Math.sqrt(average(list)) ;
        
        
        for(int num: list ){
         varBuffer =   Math.pow(num * 1.0 - avg, 2);
         var += varBuffer;
        }
        
        
       //var = varBuffer - avg;
        
        var = var / (list.size() - 1);
        
       
        
        
        
        
       
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
