import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
            System.out.print("Type a word: ");
            String input = reader.nextLine();
           
            
            if(input.isEmpty()){
                Collections.reverse(words);
                System.out.println
        ("You typed the following words:");
                for(String word: words){
                    System.out.println(word);
                }
                break;
            }
            
             words.add(input);
            
        }
        
        
        
    }
}
