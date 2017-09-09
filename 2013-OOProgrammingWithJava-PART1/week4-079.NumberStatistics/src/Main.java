import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        
         System.out.println("Type numbers: ");
       while(true){
        
       
       int input = Integer.parseInt(reader.nextLine());
       
        if(input == -1){
            break;
          
        }
        
        if(input % 2 == 0){
            even.addNumber(input);
        }else{
        
       
            odd.addNumber(input);
        }
        stats.addNumber(input);
        
       
        
        
        

    }
       System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum() );
}
}
