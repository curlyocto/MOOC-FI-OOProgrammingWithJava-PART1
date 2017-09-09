
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        char currentCharacter ;
        String reversed = "";
        
        for(int i = text.length()-1; i >= 0; i--){
           currentCharacter = text.charAt(i);
           reversed += currentCharacter;
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
