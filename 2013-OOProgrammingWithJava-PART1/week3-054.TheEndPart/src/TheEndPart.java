import java.util.Scanner;


//a program that prints the end part of a word. 
//The program asks the user for the word and the length of the end part. 
public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the end part: ");
        int endLength = Integer.parseInt(reader.nextLine());
        String result = word.substring(word.length()-endLength);
        System.out.println("Result: " + result);
        
    }
}
